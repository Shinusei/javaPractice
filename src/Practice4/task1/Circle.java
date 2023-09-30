package Practice4.task1;

public class Circle{
    private int radius;
    private int x;
    private int y;
    private boolean isFill;
    private String color;

    public Circle(int radius, int x, int y, boolean isFill, String color) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.isFill = isFill;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isFill() {
        return isFill;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setFill(boolean fill) {
        isFill = fill;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", isFill=" + isFill +
                ", color='" + color + '\'' +
                '}';
    }
}
