import java.util.Scanner;
public class J03006 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while(t>0)
    {
        String s = scanner.next();
        int cc = 1;
        int cdx = 1;
        for(int i = 0; i<s.length(); i++)
        {
            int tmp = s.charAt(i) - 48;
            if(tmp % 2 != 0) cc = 0;
            if(s.charAt(i) != s.charAt(s.length()-i-1)) cdx = 0;
            if(cc == 0 || cdx == 0) break;
        }
        if(cc == 1 && cdx == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
        t--;
    }
    }
}


