import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.*;
public class J07004 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        HashMap<Integer,Integer> arr = new HashMap<Integer,Integer>();
        while(sc.hasNextInt())
        {
            try{
                int x = sc.nextInt();
                arr.put(x,arr.getOrDefault(x, 0)+1);
            }
            catch(Exception e){

            }
        }
        for(Map.Entry<Integer,Integer> x:arr.entrySet())
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
