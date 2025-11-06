import java.math.BigInteger;
import java.util.*;
public class J03014{
    
     
       public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
           String a = scanner.next();
           String b = scanner.next();
           BigInteger A = new BigInteger(a);
           BigInteger B = new BigInteger(b);
           System.out.println(A.add(B));
    }
}


