import java.util.Scanner;
public class J02034 {    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[201];
        int maxi = -1,c = 1;
        for(int i = 0; i<n; i++)
        {
            int x = scanner.nextInt();
            a[x] = 1;
            maxi = Math.max(maxi,x);
        }
        for(int i = 1; i<=maxi; i++)
        {
            if(a[i] == 0)
            {
                System.out.println(i);
                c = 0;
            }
        }
        if(c == 1)
        {
            System.out.println("Excellent!");
        }
    }
    
}

