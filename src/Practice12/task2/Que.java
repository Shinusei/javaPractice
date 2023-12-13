package Practice12.task2;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Que {
    AbstractQueue<Integer> player1, player2;

    public Que(String player_str_1, String player_str_2) {
        this.player1 = new LinkedBlockingQueue<>();
        this.player2 = new LinkedBlockingQueue<>();
        for (int i = 0; i <= 4; i++) {
            this.player1.add(Integer.parseInt(String.valueOf(player_str_1.charAt(i))));
            this.player2.add(Integer.parseInt(String.valueOf(player_str_2.charAt(i))));
        }
    }

    public String play() {
        int c = 0;
        while(!player1.isEmpty() && !player2.isEmpty() && c < 107) {
            if ((player1.peek() > player2.peek() && player2.peek() != 0) | (player1.peek() == 0 && player2.peek() == 9)) {
                player1.add(player1.remove());
                player1.add(player2.remove());
            } else {
                player2.add(player1.remove());
                player2.add(player2.remove());
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


        System.out.println("Result: " + new Que(str1,str2).play());
    }
}