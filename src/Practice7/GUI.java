package Practice7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private int mil=0;
    private int mad=0;
    private String win ="Draw";
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: "+mil+" X "+mad);
    JLabel last = new JLabel("Last scores: N/A");
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
                last.setText("Last scores: AC Milan");
                upd("AC Milan");
            }
        });
        add(madrid);
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mad++;
                last.setText("Last scores: Real Madrid");
                upd("Real Madrid");
            }
        });
        result.setBounds(10,70,1000,20);
        add(result);
        last.setBounds(10,90,1000,20);
        add(last);
        winner.setBounds(20,110,1000,20);
        add(winner);
    }
    private void upd(String last){
        result.setText("Result: " + mil + " X " + mad);
        String w = "DRAW";
        if(mil > mad)
            w = "AC Milan";
        else if (mad > mil)
            w = "Real Madrid";
        winner.setText("Winner: "+w);
    }

    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}
