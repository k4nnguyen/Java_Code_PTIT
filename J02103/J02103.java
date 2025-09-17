import java.util.Scanner;
public class J02103{    
       public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int tt = 1;
        while(tt <= t)
        {
            System.out.printf("Test %d:\n",tt);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n+1][m+1];
            int[][] brr = new int[m+1][n+1];
            for(int i = 1; i<=n; i++)
            {
                for(int j = 1; j<=m; j++)
                {
                    arr[i][j] = brr[j][i] = scanner.nextInt();
                }
            }

            for(int i = 1; i<=n; i++)
            {
                for(int ii = 1; ii<=n; ii++)
                {
                    int tmp = 0;
                    for(int iii = 1; iii <= m; iii++)
                    {
                        tmp += arr[i][iii] * brr[iii][ii];
                    }
                    System.out.printf("%d ",tmp);
                }
                System.out.println();
            }

            tt++;
        }
    }
}


