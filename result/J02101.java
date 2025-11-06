import java.util.Scanner;
public class J02101 {    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i<n; i++)
            {
                for(int j = 0; j<n; j++)
                {
                    arr[i][j] = scanner.nextInt();
                }
            }

            int i = 0, j = 0,c=0;
            int dk1 = n-1, dk2 = n-1;
            if(n % 2 == 0)
                dk2 = 0;
            while(i != dk1 || j != dk2)
            {
                System.out.printf("%d ",arr[i][j]);
                if(i%2 == 0)
                    c = 0;
                else
                    c = 1;

                if((i %2 == 0 && j == n-1) || (i %2 != 0 && j == 0))
                    i = Math.min(i+1,n-1);
                if(c == 0)
                    j = Math.min(j+1,n-1);
                else
                    j =Math.max(j-1,0);
            }
            System.out.println(arr[i][j]);
        }
    }
}

