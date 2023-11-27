package Practice13.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();

        System.out.println("Enter the text: ");
        String text = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("src/Practice13/"+fileName);
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
            e.printStackTrace();
        }
    }
}