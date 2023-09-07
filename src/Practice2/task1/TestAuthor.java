package Practice2.task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author Puskin = new Author("Alexander Pushkin", "pushkin@mail.ru", 'm');
        System.out.println(Puskin);
        System.out.print("new email: ");
        String email = scanner.next();
        Puskin.setEmail(email);
        System.out.println(Puskin);
    }
}
