import java.util.Scanner;
public class J03008 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while(t>0)
    {
        String s = scanner.next();
        int nt = 1;
        int cdx = 1;
        for(int i = 0; i<s.length(); i++)
        {
            char k = s.charAt(i);
            if(k != s.charAt(s.length()-i-1)) cdx = 0;
            if(k != '2' && k != '3' && k!='5' && k!='7') nt = 0;
            if(cdx == 0 || nt == 0) break;
        }
        if(cdx == 1 && nt == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
        t--;
    }
    }
}


