import java.util.Scanner;
public class J01010 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        scanner.nextLine();
        while(t > 0)
        {
            int c = 1;
            String s = scanner.nextLine();
            String res = "";
            for(int i = 0; i<s.length(); i++)
            {
                char tmp = s.charAt(i);
                if(tmp == '0' || tmp == '8' || tmp == '9')
                    res += '0';
                else if(tmp == '1')
                    res += '1';
                else
                    c = 0;
            
            }
            if(c == 0)
            {
                System.out.println("INVALID");
            }
            else
            {
                long ress = Long.parseLong(res);
                if(ress != 0)
                    System.out.printf("%d\n",ress);
                else
                    System.out.printf("INVALID\n");    
            }
            t--;
        }

    }
}
