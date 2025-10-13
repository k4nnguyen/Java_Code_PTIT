import java.util.*;

public class J04004 {
    static long gcd(long a, long b)
    {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    static long lcm(long a, long b)
    {
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b,c,d;
        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        d = scanner.nextLong();

        long new_a,new_b;
        new_a = a*d + b*c;
        new_b = b*d;
        System.out.printf("%d/%d",new_a/gcd(new_a,new_b),new_b/gcd(new_a,new_b));
    }

}
