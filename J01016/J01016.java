import java.util.Scanner;
public class J01016 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int dem7 = 0;
        int dem4 = 0;
        while(n>0){
            if(n%10 == 7)
                dem7++;
            else if(n%10 == 4)
                dem4++;
            n/=10;
        }
        int res = dem4+dem7;
        if(res == 4 || res == 7)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
