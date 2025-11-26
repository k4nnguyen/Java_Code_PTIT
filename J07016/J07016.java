import java.io.*;
import java.util.*;
public class J07016 {
    public static boolean prime(int n)
    {
        if(n < 2) return false;
        if(n <= 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        for(int i = 5; i*i <= n; i+=6)
        {
            if(n%i == 0 || n % (i+2) == 0) return false;
        } 
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        List<Integer> l1 = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer,Integer> tr1 = new TreeMap<>();

        for(Integer i:l1)
        {
            if(prime(i))
            {
                if(tr1.get(i) == null) tr1.put(i,1);
                else tr1.put(i,tr1.get(i)+1);
            }
        }

        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        List<Integer> l2 = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer,Integer> tr2 = new TreeMap<>();

        for(Integer i:l2)
        {
            if(prime(i))
            {
                if(tr2.get(i) == null)
                    tr2.put(i,1);
                else
                    tr2.put(i,tr2.get(i)+1);
            }
        }

        for(Map.Entry<Integer,Integer> i:tr1.entrySet())
        {
           if(tr2.get(i.getKey()) != null)
            {
                System.out.println(i.getKey() + " " + i.getValue() + " " + tr2.get(i.getKey()));
            } 
        }
        ois.close();
    }
}