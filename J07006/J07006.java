import java.io.*;
import java.util.*;
public class J07006 {
    public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer,Integer> ts = new TreeMap<>();
        for(Integer i:l)
        {
            if(ts.get(i) == null)
                ts.put(i, 1);
            else
                ts.put(i,ts.get(i)+1);
        }
        for(Map.Entry<Integer,Integer> m:ts.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }   
        ois.close();
    }
}
