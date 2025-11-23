import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class J07002 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        long res = 0;
        while(scanner.hasNext())
        {
            try{
                String s = scanner.next();
                if(s.length() <= 10)
                    res += Long.parseLong(s);
            }
            catch(Exception e){
                
            }
        }
        System.out.println(res);
        scanner.close();
    }
}

