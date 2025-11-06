import java.util.*;
public class J03027{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder(scanner.next());
            while(1>0)
            {
                int c = 1;
                for(int i =0; i<sb.length()-1; i++)
                {
                if(sb.charAt(i) == sb.charAt(i+1))
                    {
                        sb.delete(i,i+2);
                        c = 0;
                        break;
                    }
                }
                if(c == 1) 
                    break;
            }
            if(sb.length() <= 0)
                System.out.println("Empty String");
            else
                System.out.println(sb);
        
    }
}
