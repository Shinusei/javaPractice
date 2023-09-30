package Practice6.task2;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dolmat("white",true, 5);
        Sherpherd dog2 = new Sherpherd("black",false);
        System.out.println(dog1);
        System.out.println(dog2);
        dog1.setPlace("central");
        dog2.setPlace("123");
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
