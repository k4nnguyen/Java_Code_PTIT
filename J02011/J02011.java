import java.util.Scanner;
import java.util.Stack;

public class J02011 {
    public static void swap(int[] arr, int x, int y)
    {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n+1];
    for(int i = 1; i<=n; i++)
    {
        int x = scanner.nextInt();
        a[i] = x;
    }

    for(int i = 1; i<=n-1; i++)
    {
        int tmp = i;
        for(int j = i+1; j<=n; j++)
        {
            if(a[tmp] > a[j])
                tmp = j;
        }
        swap(a,i,tmp);

        System.out.printf("Buoc %d: ",i);
        for(int j = 1; j<=n; j++)
            System.out.printf("%d ",a[j]);
        System.out.println("");

        
    }
    

}
    
}


