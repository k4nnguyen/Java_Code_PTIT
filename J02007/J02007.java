import java.util.Scanner;
public class J02007 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for(int ii = 1; ii<=t; ii++){
    System.out.printf("Test %d:\n",ii);
    int n = scanner.nextInt();
    int[] arr = new int[100005];
    int[] a = new int[101];
    for(int i = 0; i<n; i++)
    {
        int x = scanner.nextInt();
        a[i] = x;
        arr[x]++;
    }
    for(int i = 0; i<n; i++)
    {
        if(arr[a[i]] > 0)
        {
            System.out.printf("%d xuat hien %d lan\n",a[i],arr[a[i]]);
            arr[a[i]] = 0;
        }    
    }

    }

    }
}


