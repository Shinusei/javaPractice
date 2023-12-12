package Practice22.task3;

import javax.swing.*;

public class CarcasTest {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored){}

        CarcasController controller = new CarcasController();
        controller.showWindow();
    }
}
