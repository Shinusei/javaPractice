package Practice8.task3;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Animation extends JFrame {
    Animation() throws IOException, InterruptedException {
        super("Анимация");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel main = new JLabel();
        add(main);

        setSize(1920, 1080);
        setResizable(false);
        setVisible(true);


        while (true) {
            for (int i = 0; i < 17; i++) {
                main.setIcon(new ImageIcon(ImageIO.read(new File("/home/aleksey/IdeaProjects/javaPractice/src/" +
                        "Practice8/task3/images/frame_"+i+"_delay-0.04s.jpg"))));
                TimeUnit.MILLISECONDS.sleep(100);
            }
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Animation view = new Animation();
    }
}
