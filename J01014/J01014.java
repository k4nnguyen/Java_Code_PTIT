import java.util.Scanner;

public class J01014 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int ii = 0; ii<t; ii++)
        {
        long n = scanner.nextLong();
        long res = -1;
        for(int i = 2; i<=Math.sqrt(n); i++)
        {
            if(n%i == 0)
            {
                res = i;
                while(n%i == 0)
                    n/=i;
            }
        }
        if(n > 1)
            res = n;
        System.out.printf("%d\n",res);
        }
    }
}
