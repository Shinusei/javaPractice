package Practice8.task2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImagePrint extends JFrame {
    ImagePrint(String args) throws IOException {
        super("Image");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new FlowLayout());
        JLabel lbl = new JLabel();
        lbl.setIcon(new ImageIcon(ImageIO.read(new File(args))));
        add(lbl);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        ImagePrint print = new ImagePrint(args[0]);
    }
}
