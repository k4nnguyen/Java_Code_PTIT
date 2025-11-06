import java.util.Scanner;
public class J02010 {
    public static void swap(int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[101];
    for(int i = 0; i<n; i++)
    {
        a[i] = scanner.nextInt();
    }
    int c = 1;
        for(int i = 0; i<n-1; i++)
        {
            System.out.printf("Buoc %d: ",i+1);
            for(int j = i+1;j<n; j++)
            {
                if(a[i] > a[j])
                {
                    c = 0;
                    swap(a,i,j);
                }
            }
            for(int ii = 0; ii<n; ii++) System.out.printf("%d ",a[ii]);
            System.out.println("");
        }
    
    }
}


