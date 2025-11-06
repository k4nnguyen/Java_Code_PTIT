import java.util.Scanner;

public class J01002{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 0; i<test; i++)
        {
            long n = scanner.nextInt();
            n = n*(n+1)/2;
            System.out.printf("%d\n",n);
        }
    }
}