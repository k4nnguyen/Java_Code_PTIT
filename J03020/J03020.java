import java.util.*;
// Not Done
public class J03020 {
    public static int dx(String a)
    {
        for(int i = 0; i<a.length()/2; i++)
        {
            if(a.charAt(i) != a.charAt(a.length()-1-i)) return 0;
        }
        return 1;
    }
       public static void main(String[] args)
    {
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,Integer> m = new LinkedHashMap<>();
        while(scanner.hasNextLine())
        {
            String[] s = scanner.nextLine().split("\\s+");
            for(String x:s)
            {
                if(dx(x) == 1)
                {
                    if(m.containsKey(x)) m.put(x,m.get(x)+1);
                    else m.put(x,1);
                }
            }
        }

        for(String x:m.keySet())
        {
            cnt = Math.max(cnt,x.length());
        }
        for(String x:m.keySet())
        {
            if(x.length() == cnt)
            {
                System.out.printf("%s %d\n",x,m.get(x));
            }
        }        
    }
}

