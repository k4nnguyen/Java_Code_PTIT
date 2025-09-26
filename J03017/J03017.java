import java.math.BigInteger;
import java.util.*;
// Not Done
public class J03017 {
       public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0)
        {
            int cnt = 0;
           StringBuilder s = new StringBuilder(scanner.next());
           while(s.indexOf("100") != -1)
           {
                int idx = s.indexOf("100");
                s.delete(idx,idx+3);
                cnt+=3;
           }
           System.out.println(cnt);

        }
    }
}
