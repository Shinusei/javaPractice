package Practice1.task4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vector<Integer> arr = new Vector<Integer>();
        while(true){
            String str = input.nextLine();
            if (!str.isEmpty()) {
                arr.add(Integer.parseInt(str));
            } else {
                break;
            }
        }

        System.out.println(Collections.max(arr)+"  "+Collections.min(arr));
    }
}