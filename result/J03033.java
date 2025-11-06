import java.util.Scanner;
import java.math.BigInteger;

public class J03033 {
    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while(t>0)
    {
        String inp1 = scanner.next();
        String inp2 = scanner.next();
        BigInteger a = new BigInteger(inp1);
        BigInteger b = new BigInteger(inp2);
        BigInteger tu = a.multiply(b);
        BigInteger mau = a.gcd(b);

        BigInteger res = tu.divide(mau);
        System.out.println(res);
        t--;
    }    

}
    
}


