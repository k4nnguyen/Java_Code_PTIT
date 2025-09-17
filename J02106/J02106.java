import java.util.Scanner;
public class J02106 {    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for(int i = 0; i<n; i++)
        {
            int dem1 = 0;
            for(int j = 0; j<3; j++)
            {
                int x = scanner.nextInt();
                dem1+=x;
            }
            if(2*dem1>3) res++;
        }
        System.out.println(res);
    }
    
}