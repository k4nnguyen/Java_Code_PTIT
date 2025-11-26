import java.io.*;
import java.util.*;
public class J07031 {
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
        Set<Integer> se1 = new TreeSet<>();

        for(Integer i:l1)
        {
            if(prime(i))
                se1.add(i);
        }

        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        List<Integer> l2 = (ArrayList<Integer>) ois.readObject();
        Set<Integer> se2 = new TreeSet<>();

        for(Integer i:l2)
        {
            if(prime(i))
                se2.add(i);
        }

        for(Integer i:se1)
        {
            if(i >= 1000000-i)
                break;
            if(se1.contains(1000000-i) && (!se2.contains(i) && !se2.contains(1000000-i)))
            {
                System.out.println(i + " " + (1000000-i));
            }
        }
        ois.close();
    }
}