package Practice7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private int mil=0;
    private int mad=0;
    private String las = "N/A";
    private String win ="Draw";
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: "+mil+" X "+mad);
    JLabel last = new JLabel("Last scores: "+las);
    Label winner = new Label("Winner: "+win);
    GUI(){
        super("Football score");
        setSize(800,300);
        milan.setBounds(10,20,200,40);
        madrid.setBounds(220,20,200,40);
        add(milan);
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mil++;
                las="Milan";
                last.repaint();
            }
        });
        add(madrid);
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mad++;
                las="Madrid";
                dispose();
            }
        });
        result.setBounds(10,70,100,20);
        add(result);
        last.setBounds(10,90,100,20);
        add(last);
        winner.setBounds(10,110,100,20);
        add(winner);
    }

    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}
