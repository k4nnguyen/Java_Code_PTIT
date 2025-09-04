import java.util.HashMap;
import java.util.Scanner;
public class J03024{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0)
        {
            int check = 1;
            int cnt = 0;
            String s = scanner.nextLine();
            for(int i = 0; i<s.length(); i++)
            {
                char tmp = s.charAt(i);
                if(tmp >= '0' && tmp <= '9')
                {
                    if((tmp-48) % 2 == 0)
                    {
                        cnt++;
                    }
                }
                else{
                    check = 0;
                    break;
                }
            }
            if(check == 0)
            {
                System.out.println("INVALID");
            }
            else{
                if(2*cnt > s.length() && s.length() % 2 == 0)
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            t--;
        }
    }
}
