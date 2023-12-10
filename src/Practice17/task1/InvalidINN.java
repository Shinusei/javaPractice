package Practice17.task1;

import java.util.Scanner;

public class InvalidINN extends Exception {
    private String inn;
    public InvalidINN(String name) {
        super(name + ": incorrect" );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("INN: ");
        String[] inn = sc.nextLine().split("");
        try {
            if (inn.length == 12) {
                char[] checksum1 = ("" + (7 * Integer.parseInt(inn[0])
                        + 2 * Integer.parseInt(inn[1]) + 4 * Integer.parseInt(inn[2])
                        + 10 * Integer.parseInt(inn[3]) + 3 * Integer.parseInt(inn[4])
                        + 5 * Integer.parseInt(inn[5]) + 9 * Integer.parseInt(inn[6])
                        + 4 * Integer.parseInt(inn[7]) + 6 * Integer.parseInt(inn[8])
                        + 8 * Integer.parseInt(inn[9])) % 11).toCharArray();
                char[] checksum2 = ("" + (3 * Integer.parseInt(inn[0])
                        + 7 * Integer.parseInt(inn[1]) + 2 * Integer.parseInt(inn[2])
                        + 4 * Integer.parseInt(inn[3]) + 10 * Integer.parseInt(inn[4])
                        + 3 * Integer.parseInt(inn[5]) + 5 * Integer.parseInt(inn[6])
                        + 9 * Integer.parseInt(inn[7]) + 4 * Integer.parseInt(inn[8])
                        + 6 * Integer.parseInt(inn[9]) + 8 * Integer.parseInt(inn[10])) % 11).toCharArray();
                if (String.valueOf(checksum1[checksum1.length - 1]).equals(inn[10]) && String.valueOf(checksum2[checksum2.length - 1]).equals(inn[11])) {
                    System.out.println(name + ": correct");
                }
                else throw new InvalidINN(name);
            } else {
                throw new InvalidINN(name);
            }
        }
        catch (InvalidINN e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}