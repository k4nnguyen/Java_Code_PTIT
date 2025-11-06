import java.util.*;
public class J03009{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0)
        {
            String[] s1 = scanner.nextLine().split("\\s");
            String s2 = scanner.nextLine();
            Set<String> se= new HashSet<>();
            for(String i : s1)
            {
                if(!s2.contains(i))
                    se.add(i);
            }
            for(String i:se){
                System.out.printf("%s ",i);
            } 
            System.out.println();
        }
    }
}
