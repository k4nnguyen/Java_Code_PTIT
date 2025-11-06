import java.util.*;

public class J03040 {
    public static int dk1(StringBuilder s)
    {
        for(int i = 5; i<s.length()-1; i++)
        {
            if(s.charAt(i) - '0' >= s.charAt(i+1)-'0') return 0;
        }
        return 1;
    }
    public static int dk2(StringBuilder s)
    {
        char tmp = s.charAt(5);
        for(int i = 6; i<s.length(); i++)
        {
            if(tmp != s.charAt(i)) return 0;
        }
        return 1;
    }
    public static int dk3(StringBuilder s)
    {
        if((s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7)) && s.charAt(8) == s.charAt(9))
            return 1;
        return 0;
    }
    public static int dk4(StringBuilder s)
    {
        for(int i = 5; i<s.length(); i++)
        {
            char tmp = s.charAt(i);
            if(tmp != '6' && tmp != '8') return 0;
        }
        return 1;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0)
        {
            StringBuilder s = new StringBuilder(scanner.next());
            s.deleteCharAt(8);
            if(dk1(s) == 1 || dk2(s) == 1 || dk3(s) == 1 || dk4(s) == 1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
