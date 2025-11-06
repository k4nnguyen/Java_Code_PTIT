import java.util.Scanner;
public class J01013 {
    static int[] arr = new int[2000001];
    public static void sieve(){
        for(int i = 2; i<=2000000; i++) arr[i] = i;
        for(int i = 2; i<= Math.sqrt(2000000);i++)
        {
            if(arr[i] == i)
            {
                for(int j = i*i; j<=2000000; j+=i){
                if(arr[j] == j) arr[j] = i;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        sieve();
        int t = scanner.nextInt();
        long sum = 0;
        while(t>0){
            int n = scanner.nextInt();
            while(n > 1)
            {
                sum += arr[n];
                n /= arr[n];
            }
            t--;
        }
        System.out.printf("%d",sum);
    }
    
}
