import java.math.BigInteger;
import java.util.Scanner;
public class J03039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            if(a.mod(b).equals(BigInteger.ZERO)|| b.mod(a).equals(BigInteger.ZERO))
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

