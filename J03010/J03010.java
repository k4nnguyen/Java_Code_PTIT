import java.util.HashMap;
import java.util.Scanner;
public class J03010{
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
            if(cnt == wrd.length && !w.isEmpty())
            {
                String tmp = w.substring(0).toLowerCase();
                res.insert(0,tmp);
            }
            if(cnt < wrd.length && !w.isEmpty()){
                res.append(Character.toLowerCase(w.charAt(0)));
            }
            cnt++;
        }
        return res.toString().trim();
    } 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        scanner.nextLine();
        while(t>0)
        {
            String s = scanner.nextLine();
            String tmp = solve(s);
            if(map.containsKey(tmp))
            {
                int cnt = map.get(tmp) + 1;
                map.put(tmp,cnt);
                System.out.println(tmp + cnt + "@ptit.edu.vn");
            }
            else{
                map.put(tmp,1);
                System.out.println(tmp + "@ptit.edu.vn");
            }
            t--;
        }
    }
}
