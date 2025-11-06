import java.util.*;

public class J04014 {
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
        int t = scanner.nextInt();
        while(t-->0)
        {
            long a,b,c,d;
        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        d = scanner.nextLong();

        long new_a,new_b;
        new_a = (a*d + b*c)*(a*d + b*c);
        new_b = (b*d)*(b*d);
        long c_tu = new_a/gcd(new_a,new_b);
        long c_mau = new_b/gcd(new_a,new_b);
        long d_tu = a*c*c_tu;
        long d_mau = b*d*c_mau;
        System.out.printf("%d/%d %d/%d\n",c_tu,c_mau,d_tu/gcd(d_tu,d_mau),d_mau/gcd(d_tu,d_mau));
        }
    }

}
