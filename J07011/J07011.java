import java.io.*;
import java.util.*;
public class J07011 {
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
    {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        TreeMap<String,Integer> m = new TreeMap<>();
        for(int i = 0; i<n; i++)
        {
            String x = sc.nextLine();
            String[] s = x.toLowerCase().trim().split("[^a-z0-9]+");
            for(String tmp:s)
            {
                if(tmp.isEmpty())
                    continue;
                if(m.get(tmp) == null)
                    m.put(tmp,1);
                else
                    m.put(tmp,m.get(tmp)+1);
                
            }
            
        }
        List<Map.Entry<String,Integer>> a = new ArrayList<>(m.entrySet());
        a.sort((x,y) -> {
            if(x.getValue() == y.getValue())
                return x.getKey().compareTo(y.getKey());
            return y.getValue() - x.getValue();
            
        });
        int cnt = 0;
        for(Map.Entry<String,Integer> res:a)
        {
            System.out.println(res.getKey() + " " + res.getValue());
            cnt++;
        }
    }
}
