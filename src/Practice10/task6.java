package Practice10;

public class task6 {
    public static void main(String[] args) {
        int numberToCheck = 137;
        if (isPrime(numberToCheck, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return number == 2;
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }
}

