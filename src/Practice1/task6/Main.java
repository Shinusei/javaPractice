package Practice1.task6;

public class Main {
    public static void main(String[] args) {
        System.out.println(counter(0, 1));
    }

    public static double counter(double past, double down) {
        if (down == 10){
            System.exit(0);
        }
        double num = past + 1/down;
        System.out.println(num);
        counter(num, down+1);
        return 0;
    }
}
