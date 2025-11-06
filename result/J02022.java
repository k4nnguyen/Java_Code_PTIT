import java.util.Scanner;
public class J02022 {    
    static int n, check[] = new int[10];
    
    public static void Try(String s)
    {
        int len = s.length();
        if(len == n)
        {
             System.out.println(s);
        }
        for(int i = 1; i<=n; i++)
        {
            if(len == 0 || (check[i] == 0 && Math.abs(s.charAt(len-1) - '0' - i) != 1))
            {
                check[i] = 1;
                Try(s + Integer.toString(i));
                check[i] = 0;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            n = scanner.nextInt();
            Try("");
        }
    }
}

