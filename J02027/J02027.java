import java.util.*;
public class J02027{
    
        public static int upper_bound(int arr[], int l, int r, int x)
        {
            if(l > r) return l;
            int mid = (l + r) / 2;
            if(arr[mid] > x) return upper_bound(arr, l, mid-1 , x);
            else return upper_bound(arr, mid+1, r, x);
        }
       public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            int n = scanner.nextInt(), k = scanner.nextInt();
            int[] arr = new int[n];
            long res = 0;
            for(int i = 0; i<n; i++)
            {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 1; i<n; i++)
            {
                int idx = upper_bound(arr,0,i-1,arr[i] - k);
                res += (i-idx);
            }
            System.out.println(res);
        }
    }
}


