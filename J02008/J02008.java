import java.util.Scanner;
public class J02008 {
    public static long __gcd(long a, long b)
    {
        if(b == 0) return a;
        return __gcd(b,a%b);
    }
    public static long __lcm(long a, long b)
    {
        return a*b/__gcd(a,b);
    }

    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    long[] arr = new long[101];
    arr[1] = 1;
    for(int i = 2; i<=100; i++)
    {
        arr[i] = __lcm(i,arr[i-1]);
    }
    int t = scanner.nextInt();
    while(t>0)
    {
        int n = scanner.nextInt();
        System.out.printf("%d\n",arr[n]);
        t--;
    }

    }
}


