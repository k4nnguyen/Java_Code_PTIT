import java.util.Scanner;
import java.math.BigInteger;

public class J01025 {
    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int a1 = scanner.nextInt();
    int b1 = scanner.nextInt();
    int c1 = scanner.nextInt();
    int d1 = scanner.nextInt();
    int a2 = scanner.nextInt();
    int b2 = scanner.nextInt();
    int c2 = scanner.nextInt();
    int d2 = scanner.nextInt();

    int x1 = Math.min(a1,a2);
    int x2 = Math.min(b1,b2);
    int y1 = Math.max(c1,c2);
    int y2 = Math.max(d1,d2);

    int res = Math.max((y1-x1),(y2-x2));

    System.out.printf("%d",res*res);

}
    
}


