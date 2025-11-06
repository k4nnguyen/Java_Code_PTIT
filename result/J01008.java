import java.util.Scanner;

public class J01008{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i =0; i<test; i++)
        {
            int n = scanner.nextInt();
            System.out.printf("Test %d: ",i+1);
            for(int j = 2; j<=(int)Math.sqrt(n); j++)
            {
                if(n%j == 0)
                {
                    int dem = 0;
                    while(n%j == 0)
                    {
                        dem++;
                        n/=j;
                    }
                    System.out.printf("%d(%d) ",j,dem);
                }
            }
            if(n > 1)
            {
                System.out.printf("%d(1)",n);
            }
            System.out.println("");
        }
        scanner.close();
    }
}
