import java.util.HashMap;
import java.util.Scanner;
public class J03025{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0)
        {
            String s = scanner.nextLine();
            int n = s.length();
            int end = n/2;
            int cnt = 0;
            for(int i = 0; i<end; i++)
            {
                if(s.charAt(i) != s.charAt(n-i-1))
                {
                    cnt++;
                }
            }
            if((n % 2 == 0 && cnt == 1) || (n%2 == 1 && cnt <= 1))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
