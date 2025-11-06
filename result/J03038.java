import java.math.BigInteger;
import java.util.Scanner;
public class J03038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] m = new int[257];
        for(int i = 0; i<s.length(); i++)
        {
            int tmp = s.charAt(i);
            m[tmp] = 1;
        }
        int res = 0;
        for(int i = 0; i<=256; i++)
        {
            res += m[i];
        }
        System.out.print(res);
    }
}

