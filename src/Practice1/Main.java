package Practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short arrSize = 5;
        int[] arr = new int[5];

        for(int i = 0; i < arrSize; i++) {
            if (input.hasNextInt()) {
                arr[i] = input.nextInt();
            } else {
                System.out.println("Not digit");
                System.exit(0);
            }
        }
        int arrSum = 0;
        for(int i : arr){
            arrSum += i;
        }
        double arrMid = (double) arrSum /arrSize;
        System.out.println(arrSum+" "+arrMid);

    }
}