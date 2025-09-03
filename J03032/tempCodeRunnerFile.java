import java.math.BigInteger;
import java.util.Scanner;
public class J03032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0)
        {
        String a = scanner.nextLine();
        for(int i = a.length()-1; i>=0; i--)
        {
            System.out.printf("%c",a.charAt(i));
        }
        System.out.println();
        t--;
        }
    }
}

