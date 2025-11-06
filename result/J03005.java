import java.util.Scanner;
public class J03005{
    public static String solve(String s)
    {
        // Sử dụng regex
        s = s.trim().replaceAll("\\s+", " ");
        StringBuilder res = new StringBuilder();
        String[] wrd = s.split(" ");
        int cnt = 1;
        int total = 0;
        for(String w: wrd)
        {
            if(!w.isEmpty() && cnt == 1)
            {
                String tmp = w.substring(0).toUpperCase();
                res.append(tmp);
            }
            if(!w.isEmpty() && cnt > 1)
            {
                String tmp; 
                if(cnt == wrd.length)
                {
                    tmp= Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase() + ", ";
                }
                else
                {
                    tmp= Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase() + " ";
                }

                res.insert(total,tmp);
                total += tmp.length();
            }
            cnt++;
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
