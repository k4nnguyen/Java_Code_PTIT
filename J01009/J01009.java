import java.util.Scanner;

public class J01009{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long res = 0, n = scanner.nextInt();
        res = n+1;
        n--;
        while(n>1)
        {
            res = res*n+1;
            n--;
        }
        System.out.printf("%d",res);
        scanner.close();
    }
}
