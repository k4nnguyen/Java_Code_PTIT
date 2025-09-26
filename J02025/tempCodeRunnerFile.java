import java.util.*;
public class J02025{
    static int[] X = new int[17];
    static int nn, c = 0;
    static int[] arr = new int[17];
    public static int nt(int n)
    {
        if(n < 2) return 0;
        if(n<=3) return 1;
        if(n%2 == 0 || n%3 == 0) return 0;
        for(int i = 5; i*i <= n; i+=6)
        {
            if(n%i == 0 || n%(i+2) == 0) return 0;
        }
        return 1;
    }

    public static void sinh()
    {
        int sum = 0;
        for(int i = 1; i<=nn; i++)
        {
            if(X[i] > 0)
            {
                sum += arr[i];
            }
        }
        
        if(nt(sum) == 1)
        {
            for(int i = 1; i<=nn; i++)
            {
                if(X[i] > 0) System.out.printf("%d ",arr[i]);
            }
            System.out.println();
        }

        for(int i = nn; i >= 1; i--)
        {
            if(X[i] == 0)
            {
                X[i] = 1;
                break;
            }
            else{
                c += X[i];
                X[i] = 0;
            }
        }
    }

    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while(t-->0)
            {
            nn = scanner.nextInt();
                for(int i = 1; i<=nn; i++)
                {
                    arr[i] = scanner.nextInt();
                }
            
                for(int i = 1; i<=nn; i++)
                {
                    for(int j = i+1; j<=nn; j++)
                    {
                        if(arr[i] < arr[j]){
                            int tmp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tmp;
                        }
                    }
                }

                while(c != nn){
                    c = 0;
                    sinh();
                }
            }
    }
}
