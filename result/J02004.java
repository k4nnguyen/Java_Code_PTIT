import java.util.Scanner;
public class J02004 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while(t>0)
    {
        int n = scanner.nextInt();
        long[] arr = new long[n+1];
        for(int i = 0; i<n; i++) arr[i] = scanner.nextLong();
        int check = 1;
        for(int i = 0; i<n/2; i++)
        {
            if(arr[i] != arr[n-i-1])
            {
                check = 0;
                break;
            }
        }
        System.out.println(check == 1? "YES":"NO");
        t--;
    }
    }
}


