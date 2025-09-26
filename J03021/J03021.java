import java.util.*;
public class J03021{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0)
        {
            String s = scanner.next().toUpperCase();
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i<s.length(); i++)
            {
                char x = s.charAt(i);
                if(x == 'A' || x == 'B' || x == 'C')
                    sb.append('2');
                else if(x == 'D' || x == 'E' || x == 'F')
                    sb.append('3');
                else if(x == 'G' || x == 'H' || x == 'I')
                    sb.append('4');
                else if(x == 'J' || x == 'K' || x == 'L')
                    sb.append('5');
                else if(x == 'M' || x == 'N' || x == 'O')
                    sb.append('6');
                else if(x == 'P' || x == 'Q' || x == 'R' || x == 'S')
                    sb.append('7');
                else if(x == 'T' || x == 'U' || x == 'V')
                    sb.append('8');
                else if(x == 'W' || x == 'X' || x == 'Y' || x == 'Z')
                    sb.append('9');
            }
            int c = 1;
            for(int i = 0; i<sb.length()/2; i++)
            {
                if(sb.charAt(i) != sb.charAt(sb.length()-i-1))
                {
                    c = 0;
                    break;
                }
            }
            if(c == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
