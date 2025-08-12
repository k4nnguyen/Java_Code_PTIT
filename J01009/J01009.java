import java.util.Scanner;

public class J01009{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long res = 0, n = scanner.nextInt();
        for(int i = 1; i<=n; i++)
        {
            long tmp = 1;
            for(int j = 1; j<=i; j++)
                tmp *= j;
            res += tmp;    
        }
        System.out.printf("%d",res);
        scanner.close();
    }
}
