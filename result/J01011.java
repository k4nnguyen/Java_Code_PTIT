import java.util.Scanner;
public class J01011 {
    public static long gcd(long a, long b)
    {
        if(b == 0) return a;
        return gcd(b,a%b);
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0)
        {
            long a,b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            long _gcd = gcd(a,b);
            long _lcm = a*b/_gcd;
            System.out.printf("%d %d\n",_lcm,_gcd);
            t--;
        }
    }
}
