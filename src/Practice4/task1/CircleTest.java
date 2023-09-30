package Practice4.task1;

class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5,3,4,true,"red");
        System.out.println(circle);
        System.out.println(circle.getColor());
        circle.setFill(false);
        System.out.println(circle);
    }
}