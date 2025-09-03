import java.util.Scanner;
public class J03005{
    public static String solve(String s)
    {
        // Sử dụng regex
        s = s.trim().replaceAll("\\s+", " ");
        StringBuilder res = new StringBuilder();
        String[] wrd = s.split(" ");
        for(int i = 0; i<wrd.length; i++)
        {
            if(i == wrd.length-1)
            {
                res.append()
            }
        }
        return res.toString().trim();
    } 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0)
        {
            String s = scanner.nextLine();
            System.out.println(solve(s));
            t--;
        }
    }
}