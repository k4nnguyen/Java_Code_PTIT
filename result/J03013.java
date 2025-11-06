import java.math.BigInteger;
import java.util.Scanner;
public class J03013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0)
        {
        String a = scanner.next();
        String b = scanner.next();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        int max = Math.max(A.toString().length(), B.toString().length());
        String res = A.subtract(B).abs().toString();
        while(res.length() < max) res = "0" + res;
        System.out.println(res);
        t--;
        }
    }
}

