package Practice6.task1;

public class DishTest {
    public static void main(String[] args) {
        Cup cup1 = new Cup("glass", 1000, "high", "med");
        Dish cup2 = new Cup("phorfor", 4000, "old", "small");
        Plate plate1 = new Plate("plastic", 100, 5);
        System.out.println(cup1);
        System.out.println(cup2);
        System.out.println(plate1);
        cup2.filling("cola");
        plate1.filling("potato");
        System.out.println(cup1);
        System.out.println(cup2);
        System.out.println(plate1);
    }
}
