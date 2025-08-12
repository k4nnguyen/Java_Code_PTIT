import java.util.Scanner;

public class J01003{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a == 0 && b != 0)
        {
            System.out.print("VN");
        }
        else if(a == 0 && b == 0)
        {
            System.out.print("VSN");
        }
        else{
            double res = (double)-b/a;
            System.out.printf("%.2f",res);
        }
    }
}
