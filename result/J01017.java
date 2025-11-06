import java.util.Scanner;
public class J01017 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for(int i = 1; i<=t; i++)
    {
        long n = scanner.nextLong();
        long tmp = n%10;
        n/=10;
        int check = 1;
        while(n > 0)
        {
            long k = n%10;
            long checker = Math.abs(tmp-k);
            if(checker != 1)
            {
                check = 0;
                break;
            }
            tmp = k;
            n/=10;
        }
        if(check == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    }
}

