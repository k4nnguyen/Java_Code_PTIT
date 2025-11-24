import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class J07022 {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        Scanner scanner = new Scanner(new File("DATA.in"));
        Vector<String> v = new Vector<>();
        while(scanner.hasNext())
        {
            String s = scanner.next();
            try{
                Integer.parseInt(s);
            }
            catch(Exception e)
            {
                v.add(s);
            }
        }
        Collections.sort(v);
        for(String x:v)
        {
            System.out.print(x + " ");
        }
    }
}
