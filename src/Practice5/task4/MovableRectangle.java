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
        if(!checkSpeed()) return;
        topLeft.y+= topLeft.ySpeed;
        bottomRight.y+= topLeft.ySpeed;
    }

    public void moveDown() {
        if(!checkSpeed()) return;
        topLeft.y-= topLeft.ySpeed;
        bottomRight.y-= topLeft.ySpeed;
    }

    public void moveLeft() {
        if(!checkSpeed()) return;
        topLeft.x-= topLeft.xSpeed;
        bottomRight.x-= topLeft.xSpeed;
    }

    public void moveRight() {
        if(!checkSpeed()) return;
        topLeft.x+= topLeft.xSpeed;
        bottomRight.x+= topLeft.xSpeed;
    }
}
