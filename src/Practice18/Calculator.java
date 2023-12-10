package Practice18;

public class Calculator<T extends Number, V extends Number> {
    private T a;
    private V b;

    public Calculator(T a, V b) {
        this.a=a;
        this.b=b;
    }

    public double sum(){
        return a.doubleValue()+b.doubleValue();
    }
    public double multiply(){
        return a.doubleValue()*b.doubleValue();
    }
    public double divide(){
        return a.doubleValue()-b.doubleValue();
    }
    public double subtraction(){

            return a.doubleValue() / b.doubleValue();

    }
    public static void main(String[] args){
        Calculator<Integer, Integer> r = new Calculator<>(1, 5);
        System.out.println("Sum: "+r.sum());
        System.out.println("Divide: " + r.divide());
        System.out.println("Multiply: " +r.multiply());
        System.out.println("Subtraction: " + r.subtraction());
    }
}
