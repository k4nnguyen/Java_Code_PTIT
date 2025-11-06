import java.util.Scanner;

public class J01021 {
    static long MOD = (long)1e9+7;
    public static long bin_pow(long a, long b)
    {
        if(b == 0) return 1;
        long x = bin_pow(a,b/2);
        if(b % 2 == 1)
            return ((x*x)%MOD*a)%MOD;
        else
            return (x*x)%MOD;
    }
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while(x > 0)
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a == 0 && b == 0) break;
            System.out.printf("%d\n",bin_pow(a,b));
        }
     }
}
