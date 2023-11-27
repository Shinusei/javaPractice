package Practice8.task1t;

import javax.swing.*;

abstract public class Shape extends JPanel {
    protected int[] background_color = new int[3];
    protected int position;

    public int[] getBackground_color() {
        return background_color;
    }

    public Shape() {
        this.background_color[0] = (int) (Math.random() * 255);
        this.background_color[1] = (int) (Math.random() * 255);
        this.background_color[2] = (int) (Math.random() * 255);
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}