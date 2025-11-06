import java.util.*;
public class J03029{    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String dau = ".!?";
        while(scanner.hasNextLine())
        {
            String s = scanner.nextLine().toLowerCase();
            if(s.length()>0)
            {
                s.trim().replaceAll("\\s+", " ");
                if(dau.indexOf(s.charAt(s.length()-1)) == -1) s+=".";
                String[] wrd = s.split("\\s+");
                int size = wrd.length;
                if(wrd[wrd.length-1].length() == 1 && dau.contains(wrd[wrd.length-1]))
                {
                    if(wrd.length > 1)
                    {
                        size--;
                        wrd[wrd.length-2] += wrd[wrd.length-1];
                    }
                }
                int i = 0;
                while(i < size)
                {
                    wrd[i] = Character.toString(wrd[i].charAt(0)).toUpperCase() + wrd[i].substring(1);
                    while(dau.indexOf(wrd[i].charAt(wrd[i].length()-1)) == -1)
                    {
                        System.out.printf("%s ",wrd[i]);
                        i++;
                    }
                    System.out.printf("%s ",wrd[i]);
                    i++;
                    System.out.println();
                }
            }
            
        }
    }
}


