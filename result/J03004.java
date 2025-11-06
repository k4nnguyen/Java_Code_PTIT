import java.util.Scanner;
public class J03004{
    public static String solve(String s)
    {
        // Sử dụng regex
        s = s.trim().replaceAll("\\s+", " ");
        StringBuilder res = new StringBuilder();
        String[] wrd = s.split(" ");
        for(String w: wrd)
        {
            if(!w.isEmpty())
            {
                res.append(Character.toUpperCase(w.charAt(0)))
                .append(w.substring(1).toLowerCase())
                .append(" ");
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