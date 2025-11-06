import java.util.Scanner;
public class J02014 {
    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while(t > 0)
    {
        int n = scanner.nextInt();
    int[] a = new int[100005];
    int left = 0, right = 0;
    for(int i = 1; i<=n; i++)
    {
        a[i] = scanner.nextInt();
        if(i>2) right += a[i];
    }
    left = a[1];

    int step = 2,c = 0;

    while(step <= n-1)
    {
        if(left == right)
        {
            System.out.printf("%d\n",step);
            c = 1;
            break;
        }
        else{
            left += a[step];
            right -= a[step+1];
            step++;
        }
    }
    if(c == 0)
        System.out.println("-1");
        t--;
    }

}
    

}


