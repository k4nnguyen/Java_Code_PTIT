import java.util.Scanner;

public class J01022 {
    public static long[] a = new long[100];
    
    public static char solve(int n, long k)
    {
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= a[n-2]) return solve(n-2,k);
        return solve(n-1 , k-a[n-2]);
    }
    public static void main(String[] args)
    {
        a[1] = 1;
        a[2] = 1;
        for(int i = 3; i<=92; i++)
        {
            a[i] = a[i-1] + a[i-2];
        }

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t --> 0)
        {
            long k;
            int n;
            n = scanner.nextInt();
            k = scanner.nextLong();
            System.out.println(solve(n,k));
        }
    }
}