import java.util.Scanner;

public class J01004 {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 0; i<test; i++)
        {
            int n = scanner.nextInt();
            if(check(n) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    public static int check(int n)
    {
        if(n < 2)
            return 0;
        if(n<=3)
            return 1;
        if(n%2 == 0 || n%3 == 0)
            return 0;
        for(int i = 5; i*i <=n; i+=6)
        {
            if(n%i == 0 || n%(i+2) == 0)
                return 0;
        }
        return 1;
    }
}
