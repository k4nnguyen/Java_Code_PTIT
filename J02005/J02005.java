import java.util.Scanner;
public class J02005 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    boolean[] arrA = new boolean[1001];
    boolean[] arrB = new boolean[1001];
    for(int i = 0; i<n; i++)
    {
        int x = scanner.nextInt();
        arrA[x] = true;
    }
    for(int i = 0; i<m; i++)
    {
        int x = scanner.nextInt();
        arrB[x] = true;
    }

    for(int i = 0; i<=1000; i++)
    {
        if(arrA[i] == true && arrB[i] == true)
        {
            System.out.printf("%d ",i);
        }
    }
    }
}


