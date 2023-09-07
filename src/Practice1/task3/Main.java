package Practice1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{1, 4, 3, 6, 8};
        int arrSum = 0;
        for(int i : arr) {
            arrSum+=i;
        }
        double arrMid = (double) arrSum /arr.length;
        System.out.println(arrSum+" "+arrMid);
    }
}