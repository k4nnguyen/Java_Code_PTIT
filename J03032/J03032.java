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
        String[] w = a.split("[' ']+");
        for(int i = 0; i<w.length; i++)
        {
            for(int j = w[i].length()-1; j>=0; j--)
            {
                System.out.printf("%c",w[i].charAt(j));
            }
            System.out.print(' ');
        }
        System.out.println();
        t--;
        }
    }
}

