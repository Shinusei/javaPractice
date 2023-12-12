package Practice22.task1;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexAbstractFactory com = new ConcreteFactory();
        System.out.println(com.createComplex(5, 6));
        System.out.println(com.createComplex());
    }
}