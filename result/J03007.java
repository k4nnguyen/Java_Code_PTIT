import java.util.Scanner;
public class J03007 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while(t>0)
    {
        String s = scanner.next();
        int sum = 0;
        int cdx = 1;
        for(int i = 0; i<s.length(); i++)
        {
            sum += s.charAt(i) - 48;
            if(s.charAt(i) != s.charAt(s.length()-i-1)) cdx = 0;
            if(cdx == 0) break;
        }
        if(cdx == 1 && sum % 10 == 0 && s.charAt(0) == '8' && s.charAt(s.length()-1) == '8')
            System.out.println("YES");
        else
            System.out.println("NO");
        t--;
    }
    }
}


