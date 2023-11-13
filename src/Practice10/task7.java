package Practice10;

public class task7 {
    public static void main(String[] args) {
        int n = 145;
        findPrimeFactors(n, 2);
    }

    public static void findPrimeFactors(int n, int divisor) {
        if (n <= 1) {
            return;
        }

        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            findPrimeFactors(n / divisor, divisor);
        } else {
            findPrimeFactors(n, divisor + 1);
        }
    }

}
