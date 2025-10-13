import java.util.*;

public class J04003 {
    static long gcd(long a, long b)
    {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b;
        a = scanner.nextLong();
        b = scanner.nextLong();
        System.out.printf("%d/%d",a/gcd(a,b),b/gcd(a, b));
    }

}
