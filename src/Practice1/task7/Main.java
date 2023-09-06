package Practice1.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fact(scanner.nextInt()));
    }

    public static int fact(int num) {
        return num == 1 ? 1 : num*fact(num-1);
    }
}
