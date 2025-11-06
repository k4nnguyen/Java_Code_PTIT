import java.util.*;
public class J02025{
    public static int check(int nn)
    {
        if(nn < 2)
            return 0;
        if(nn<=3)
            return 1;
        if(nn%2 == 0 || nn%3 == 0)
            return 0;
        for(int i = 5; i*i <=nn; i+=6)
        {
            if(nn%i == 0 || nn%(i+2) == 0)
                return 0;
        }
        return 1;
    }
    public static void Try(String s, int sum, int en, int[] a)
    {
        if(check(sum) == 1) System.out.println(s);
        for(int i = a.length - 1; i > en; i--)
        {
            Try(s+a[i]+' ',sum+a[i],i,a);
        }
    }    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n; i++)
            {
                arr[i] = scanner.nextInt();
            }
            for(int i = 0; i<n-1; i++)
            {
                for(int j = i+1; j<n; j++)
                {
                    if(arr[i] < arr[j])
                    {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            Try("",0,-1,arr);
        }
    }
}


