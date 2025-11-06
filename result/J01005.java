import java.util.Scanner;
public class J01005 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int ii = 0; ii<t; ii++)
        {
            double n = scanner.nextDouble();
            double h = scanner.nextDouble();
            for(int i = 1; i<n; i++)
            {
                double res = h*Math.sqrt(i/n);
                System.out.printf("%.6f ",res);
            }
            System.out.print("\n");
        }
    }
}
