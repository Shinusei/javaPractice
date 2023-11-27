package Practice12.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stek {
    Stack<Integer> player1, player2;

    public Stek(String player_str_1, String player_str_2) {
        this.player1 = new Stack<>();
        this.player2 = new Stack<>();
        for (int i = 4; i >= 0; i--) {
            this.player1.push(Integer.parseInt(String.valueOf(player_str_1.charAt(i))));
            this.player2.push(Integer.parseInt(String.valueOf(player_str_2.charAt(i))));
        }
    }
    public void push_back(Stack <Integer> main_stack, int num) {
        Stack<Integer> temp = new Stack<>();
        while (!main_stack.isEmpty()) {
            temp.push(main_stack.pop());
        }
        main_stack.push(num);
        while (!temp.isEmpty()) {
            main_stack.push(temp.pop());
        }
    }

    public String play() {
        int c = 0;
        while(!player1.isEmpty() && !player2.isEmpty() && c < 107) {
            if ((player1.peek() > player2.peek() && player2.peek() != 0) | (player1.peek() == 0 && player2.peek() == 9)) {
                push_back(player1, player1.pop());
                push_back(player1, player2.pop());
            } else {
                push_back(player2, player1.pop());
                push_back(player2, player2.pop());
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
            System.out.println("Введите набор карт для игрока 1:");
            str1 = scanner.next();
            System.out.println("Введите набор карт для игрока 2:");
            str2 = scanner.next();
            String str = str1 + str2;
            char[] str_char_arr = str.toCharArray();
            Arrays.sort(str_char_arr);
            String new_str = new String(str_char_arr);
            if (new_str.equals("0123456789")) break;
            System.out.println("Неверные входные данные");
        }


        System.out.println("Результат: " + new Stek(str1,str2).play());
    }
}
