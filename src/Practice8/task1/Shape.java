package Practice8.task1;

import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected double positionX;
    protected double positionY;

    public Shape(Color color, double positionX, double positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public abstract void draw();
}
