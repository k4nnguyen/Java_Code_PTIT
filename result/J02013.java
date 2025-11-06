import java.util.Scanner;
public class J02013 {
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
    int step = 1;
    while(true)
    {
        int c = 1;
        for(int i = 0; i<n-1; i++)
        {
                if(a[i] > a[i+1])
                {
                    c = 0;
                    swap(a,i,i+1);
                }
        }
        if(c == 1) break;
        System.out.printf("Buoc %d: ",step);
        for(int ii = 0; ii<n; ii++) System.out.printf("%d ",a[ii]);
        System.out.println("");
        step++;
    }
    
    }
}


