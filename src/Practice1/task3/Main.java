package Practice1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short arrSize = 5;
        int[] arr = new int[5];
        int arrSum = 0;
        for(int i = 0; i < arrSize; i++) {
            arr[i]=i;
            arrSum+=i;
        }
        double arrMid = (double) arrSum /arrSize;
        System.out.println(arrSum+" "+arrMid);

    }
}