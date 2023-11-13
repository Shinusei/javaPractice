package Practice10;

public class task5 {
    public static int count(int n){
        if (n/10==0) return n;
        return n%10+count(n/10);
    }

    public static void main(String[] args) {
        System.out.println(count(15506));
    }
}
