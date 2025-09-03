import java.math.BigInteger;
import java.util.Scanner;
public class J03015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger res = A.subtract(B);
        System.out.println(res);
    }
}
