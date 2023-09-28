package Practice5.task4;

public class MovableCircle {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp() {
        center.y += center.ySpeed;
    }

    public void moveDown() {
        center.y-= center.ySpeed;
    }

    public void moveLeft() {
        center.x-= center.xSpeed;
    }

    public void moveRight() {
        center.x+= center.xSpeed;
    }
}
