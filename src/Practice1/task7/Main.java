package Practice1.task7;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fact(scanner.nextInt()));
    }
    public static BigInteger fact(int num) {
        if(num>10000) {
            System.out.println("To big");
            return BigInteger.valueOf(0);
        }
        if (num==0) return BigInteger.valueOf(1);
        return num == 1 ? BigInteger.valueOf(1) : BigInteger.valueOf(num).multiply(fact(num-1));
    }
}
