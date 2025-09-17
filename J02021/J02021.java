import java.util.Scanner;
public class J02021{    
    static int n,k,cnt = 0;
    static int[] arr = new int[105];

    public static void Try(int i, int start)
    {
        if(i == k)
        {
            cnt++;
            for(int j = 0; j<k; j++)
            {
                System.out.printf("%d",arr[j]);
            }
            System.out.print(" ");
            return;
        }
        for(int ii = start; ii <= n-k+i+1; ii++)
        {
            arr[i] = ii;
            Try(i+1,ii+1);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        Try(0,1);
        System.out.println();
        System.out.printf("Tong cong co %d to hop",cnt);
    }
}


