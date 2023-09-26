package Practice5.task4;

public class MovableRectangle {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean checkSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public void moveUp() {
        topLeft.y++;
        bottomRight.y++;
    }

    public void moveDown() {
        topLeft.y--;
        bottomRight.y--;
    }

    public void moveLeft() {
        topLeft.x--;
        bottomRight.x--;
    }

    public void moveRight() {
        topLeft.x++;
        bottomRight.x++;
    }
}
