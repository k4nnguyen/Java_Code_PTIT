import java.math.BigInteger;
import java.util.*;
// Not Done
public class J03018 {
       public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0)
        {
            BigInteger n = new BigInteger(scanner.next());
            BigInteger Mod = BigInteger.valueOf(5);
            BigInteger a = BigInteger.valueOf(1).modPow(n,Mod);
            BigInteger b = BigInteger.valueOf(2).modPow(n,Mod);
            BigInteger c = BigInteger.valueOf(3).modPow(n,Mod);
            BigInteger d = BigInteger.valueOf(4).modPow(n,Mod);
            
            System.out.println(a.add(b).add(c).add(d).mod(Mod));
        }
    }
}
