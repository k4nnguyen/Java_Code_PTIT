import java.util.Scanner;
public class J02006 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    boolean[] arr = new boolean[1001];
    for(int i = 0; i<n; i++)
    {
        int x = scanner.nextInt();
        arr[x] = true;
    }
    for(int i = 0; i<m; i++)
    {
        int x = scanner.nextInt();
        arr[x] = true;
    }

    for(int i = 0; i<=1000; i++)
    {
        if(arr[i] == true)
        {
            System.out.printf("%d ",i);
        }
    }
    }
}


