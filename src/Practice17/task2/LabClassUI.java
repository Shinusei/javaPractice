package Practice17.task2;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class LabClassUI extends JFrame {

    private ArrayList<Student> students_arr;
    private JTable table;

    public LabClassUI(ArrayList<Student> students_arr){
        super("Students info");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(520, 330);
        setResizable(false);
        this.students_arr = students_arr;
        JPanel panel = new JPanel(new FlowLayout());
        JButton add_btn = new JButton("Add");
        JButton sort_btn = new JButton("Sort by GPA");
        JButton search_btn = new JButton("Find");
        panel.add(add_btn);
        panel.add(search_btn);
        panel.add(sort_btn);

        Object [][] exist_stud = new String[students_arr.size()][3];
        for(int i = 0; i < students_arr.size(); i++){
            exist_stud[i][0] = students_arr.get(i).getFio();
            exist_stud[i][1] = ((Integer)(students_arr.get(i).getiDNumber())).toString();
            exist_stud[i][2] = ((Double)(students_arr.get(i).getGPA())).toString();
        }
        table = new JTable( new DefaultTableModel(exist_stud, new String[] {"Name", "ID", "GPA"})){
            @Override
            public boolean isCellEditable(int x, int y) {return false; }
        };
        JTableHeader header = table.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);
        add_btn.addActionListener(e -> {
            try {
                add();
            }catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });
        search_btn.addActionListener(e->{
            try{
                find();
            } catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });
        sort_btn.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LabClassDriver ms = new LabClassDriver();
                ms.quick_sort(students_arr,0,students_arr.size()-1);
                DefaultTableModel table_mod = (DefaultTableModel) table.getModel();
                for(int i = 0; i<students_arr.size();i++) {
                    table_mod.removeRow(i);
                    Student st = students_arr.get(i);
                    table_mod.insertRow(i, new Object[]{st.getFio(), st.getiDNumber(), st.getGPA()});
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseDragged(MouseEvent e) {}
            @Override
            public void mouseMoved(MouseEvent e) {}
        });


        getContentPane().add(panel, BorderLayout.SOUTH);
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        setVisible(true);
    }

    private void add() {
        String fio = JOptionPane.showInputDialog("Student name: ");
        if(fio.isEmpty()) try {
            throw new EmptyStringException(this);
        } catch (EmptyStringException e) {
            throw new RuntimeException(e);
        }
        String number = JOptionPane.showInputDialog("ID:");


        if(number.isEmpty()) try {
            throw new EmptyStringException(this);
        } catch (EmptyStringException e) {
            throw new RuntimeException(e);
        }

        String GPA = JOptionPane.showInputDialog("GPA:");
        if(GPA.isEmpty()) try {
            throw new EmptyStringException(this);
        } catch (EmptyStringException e) {
            throw new RuntimeException(e);
        }
        students_arr.add(new Student(fio, Integer.parseInt(number), Double.parseDouble(GPA)));
        DefaultTableModel table_mod = (DefaultTableModel) table.getModel();
        table_mod.addRow(new Object[]{fio, number,GPA});
    }

    private void find() throws StudentNotFoundException {
        String search_val = JOptionPane.showInputDialog("Write name:");
        for(int i = 0; i < students_arr.size(); i++){
            if(students_arr.get(i).getFio().equals(search_val)){
                JOptionPane.showMessageDialog(this, "Result: "+
                        students_arr.get(i).toString());
                return;
            }
        }
        throw new StudentNotFoundException(search_val, this);
    }
}

