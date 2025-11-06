import java.util.*;
public class J02016{    
       public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            int n = scanner.nextInt(),c = 0;
            long[] arr = new long[n];
            for(int i = 0; i<n; i++)
            {
                arr[i] = scanner.nextLong();
            }
            Arrays.sort(arr);
            for(int i = 0; i<n; i++)
            {
                for(int j = i+1; j<n; j++)
                {
                    long tmp = (long)Math.sqrt(arr[i] * arr[i] + arr[j] * arr[j]);
                    if(arr[i] * arr[i] + arr[j] * arr[j] != tmp * tmp)
                        continue;
                    if(Arrays.binarySearch(arr,tmp) > j)
                    {
                        c = 1;
                        break;
                    }
                }
            }
            if(c == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}


