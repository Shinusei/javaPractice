package Practice12.task3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Dek {
    ArrayDeque<Integer> player1, player2;

    public Dek(String player_str_1, String player_str_2) {
        this.player1 = new ArrayDeque<>();
        this.player2 = new ArrayDeque<>();
        for (int i = 0; i <= 4; i++) {
            this.player1.addLast(Integer.parseInt(String.valueOf(player_str_1.charAt(i))));
            this.player2.addLast(Integer.parseInt(String.valueOf(player_str_2.charAt(i))));
        }
    }

    public String play() {
        int c = 0;
        while(!player1.isEmpty() && !player2.isEmpty() && c < 107) {
            if ((player1.peek() > player2.peek() && player2.peek() != 0) | (player1.peek() == 0 && player2.peek() == 9)) {
                player1.addLast(player1.removeFirst());
                player1.addLast(player2.removeFirst());
            } else {
                player2.addLast(player1.removeFirst());
                player2.addLast(player2.removeFirst());
            }
            System.out.println(player1 + " " + player2);
            c++;
        }
        if (!player1.isEmpty() && c < 107) return "first " + String.valueOf(c);
        if (!player2.isEmpty()&& c < 107) return "second " + String.valueOf(c);
        return "botva";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1;
        String str2;

        while (true) {
            System.out.println("Cards for player 1:");
            str1 = scanner.next();
            System.out.println("Cards for player 2:");
            str2 = scanner.next();
            String str = str1 + str2;
            char[] str_char_arr = str.toCharArray();
            Arrays.sort(str_char_arr);
            String new_str = new String(str_char_arr);
            if (new_str.equals("0123456789")) break;
            System.out.println("Wrong input");
        }


        System.out.println("Result: " + new Dek(str1,str2).play());
    }
}