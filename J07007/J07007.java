
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;
public class J07007 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> arr = new TreeSet<>();
        while(sc.hasNext())
        {
            try{
                String s = sc.next().toLowerCase();
                arr.add(s);
            }
            catch(Exception e)
            {

            }
        }
        for(String s:arr)
        {
            System.out.println(s);
        }
    }
}
