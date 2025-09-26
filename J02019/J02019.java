import java.util.*;
public class J02019{
    static int[] arr = new int[1000005];
    static int bin_pow(int a, int n)
    {
        if(n == 0) return 1;
        int x = bin_pow(a,n/2);
        if(n % 2 == 0) return x*x;
        else return x*x*a;
    }
    static void sieve()
    {
        for(int i = 2; i*i <= 1000000; i++)
        {
            if(arr[i] == 0)
            {
                arr[i] = i;
                for(int j = 0; j*i<=1000000; j++)
                {
                    arr[i*j] = i;
                }
            }
        }
        for(int i = 2; i<= 1000000; i++)
        {
            if(arr[i] == 0) arr[i] = i+1;
            else{
                int n = i, cnt = 0;
                while(n % arr[i] == 0)
                {
                    n /= arr[i];
                    ++cnt;
                }
                if(n == 1) arr[i] = (bin_pow(arr[i],cnt+1) - 1) / (arr[i]-1);
                else arr[i] = arr[bin_pow(arr[i],cnt)] * arr[n];
            }
        }
    }    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a,b,res = 0;
        sieve();
        a = scanner.nextInt();
        b = scanner.nextInt();
        for(int i = a; i<=b; i++)
        {
            if(arr[i] > 2*i) ++res;
        }
        System.out.println(res);
    }
}


