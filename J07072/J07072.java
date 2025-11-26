import java.io.*;
import java.util.*;
public class J07072 {
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<String> ts = new ArrayList<>();
        while(sc.hasNextLine())
        {
            ts.add(sc.nextLine());
        }
        for(int i = 0; i< ts.size(); i++)
        {
            String[] s = ts.get(i).toLowerCase().trim().split("\\s+");
            for(int j = 0; j<s.length; j++)
            {
                s[j] = Character.toUpperCase(s[j].charAt(0)) + s[j].substring(1);
            }
            ts.set(i, String.join(" ",s));
        }
        ts.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2)
            {
                String t1 = s1.substring(s1.lastIndexOf(" "));
                String t2 = s2.substring(s2.lastIndexOf(" "));
                String h1 = s1.substring(0,s1.lastIndexOf(" "));
                String h2 = s2.substring(0,s2.lastIndexOf(" "));
                if(t1.compareTo(t2) == 0)
                {
                    return h1.compareTo(h2);
                }
                return t1.compareTo(t2);
            }
        });
        for(String s:ts)
        {
            System.out.println(s);
        }
        sc.close();
    }    
}
