package Practice8.task1t;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Printer extends JFrame {
    JPanel[] pnl = new JPanel[20];

    public Printer(int[] position) {
        super("Shapes");
        JPanel grid = new JPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 4));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
            pnl[i].setLayout(new BorderLayout());
            switch (position[i]) {
                case 0:
                    pnl[i].add(new Circle(position[i]), BorderLayout.CENTER);
                    break;
                case 1:
                    pnl[i].add(new Rect(position[i]), BorderLayout.CENTER);
                    break;
                default:
                    break;
            }
        }
        setSize(700, 400);
        setResizable(false);
        setVisible(true);

    }
//
    public static void main(String[] args) {
        int nums[] = new int[20];
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            nums[i] = random.nextInt(2);
        }
        Printer print = new Printer(nums);
    }
}
