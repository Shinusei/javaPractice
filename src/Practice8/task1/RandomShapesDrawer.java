package Practice8.task1;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesDrawer extends JFrame{
    JPanel[] pnl = new JPanel[20];
    RandomShapesDrawer(){
        super("Random");
        setSize(1500,1500);
        for (int i = 0; i < 20; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
    }
    public static void main(String[] args) {

    }
}
