import java.util.Scanner;
public class J02104{    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                int s = scanner.nextInt();
                if(s == 1 && i <= j)
                    System.out.printf("(%d,%d)\n",i,j);
            }
        }
    }
}


