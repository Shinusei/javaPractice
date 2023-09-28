package Practice5.task4;

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle rect1 = new MovableRectangle(1,3,2,5,4,8);
        MovableCircle cir1 = new MovableCircle(1,4,3,6,8);
        MovablePoint point1 = new MovablePoint(1,4,2,5);
        System.out.println(rect1);
        System.out.println(cir1);
        System.out.println(point1);
        rect1.moveDown();
        cir1.moveLeft();
        point1.moveUp();
        System.out.println(rect1);
        System.out.println(cir1);
        System.out.println(point1);
    }
}
