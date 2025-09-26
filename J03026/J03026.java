import java.util.*;

public class J03026 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0)
        {
            String a = scanner.next();
            String b = scanner.next();
            if(a.equals(b))
                System.out.println(-1);
            else
                System.out.println(Math.max(a.length(), b.length()));
        }
    }
}
