import java.util.Scanner;
public class J01024 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for(int i = 1; i<=t; i++)
    {
        long n = scanner.nextLong();
        long check = 1;
        while(n > 0)
        {
            long tmp = n%10;
            if(tmp != 0 && tmp != 1 && tmp != 2)
            {
                check = 0;
                break;
            }
            n/=10;
        }
        if(check == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    }
}

