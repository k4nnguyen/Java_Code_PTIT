import java.util.Scanner;
public class J01007 {
    static long[] fibo = new long[93];
    
    public static void fib(){
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i<=92; i++)
        {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }

    public static void main(String[] args)
    {
        fib();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int ii = 0; ii<t; ii++)
        {
            long n = scanner.nextLong();
            int check = 0;
            for(int i = 0; i<=92; i++)
            {
                if(fibo[i] > n)
                {
                    break;
                }
                if(fibo[i] == n)
                {
                    check = 1;
                    break;
                }
            }
            if(check == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        } 
    }
}
