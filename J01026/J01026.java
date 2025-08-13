import java.util.Scanner;
public class J01026 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for(int i = 1; i<=t; i++)
    {
        long n = scanner.nextLong();
        long k = (long)Math.sqrt(n);
        if(k*k == n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    }
}

