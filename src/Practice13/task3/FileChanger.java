package Practice13.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileChanger {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        fileName = "src/Practice13/"+fileName;

        System.out.println("Enter the old text: ");
        String oldText = scanner.nextLine();

        System.out.println("Enter the new text: ");
        String newText = scanner.nextLine();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line.replace(oldText, newText));
                stringBuilder.append("\n");
            }
            bufferedReader.close();

            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(stringBuilder.toString());
            fileWriter.close();

            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }

}
