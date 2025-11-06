import java.util.Scanner;
public class J01012 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test>0){
            long n = scanner.nextLong();
            int dem = 0;
            for(int i = 1; i<=Math.sqrt(n); i++)
            {
                if(n%i == 0)
                {
                    if(n/i == i)
                    {
                        if(i % 2 == 0)
                            dem++;
                    }
                    else{
                        if(i % 2 == 0)
                            dem++;
                        if((n/i) % 2 == 0)
                            dem++;
                    }
                }
            }
            System.out.printf("%d\n",dem);
            test--;
        }
    }
    
}
