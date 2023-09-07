package Practice1.task6;

public class Main {
    public static void main(String[] args) {
        counter(0, 1);
    }

    public static double counter(double past, double down) {
        if (down == 11){
            System.exit(0);
        }
        double num =  1/down;
        System.out.printf(String.format("%8.2f", num));
        counter(num, down+1);
        return 0;
    }
}
