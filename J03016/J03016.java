import java.math.BigInteger;
import java.util.*;

public class J03016 {
       public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0)
        {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger m = new BigInteger("11");
            BigInteger res = new BigInteger("0");
            if(a.mod(m).equals(res))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
