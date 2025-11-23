import java.io.*;
import java.util.*;
public class J07015 {
    static int a[] = new int[10001];
    public static void prime()
    {
        Arrays.fill(a,1);
        a[0] = a[1] = 0;
        for(int i = 2; i<=100;i++)
        {
            if(a[i] == 1)
            {
                for(int j = i*i; j<10000; j+=i)
                {
                    a[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SONGUYEN.in")));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        int[] arr = new int[10001];
        prime();
        for(Integer i:l)
        {
            arr[i] += a[i];
        }
        for(int i = 2; i<10000; i++)
        {
            if(arr[i] > 0)
            {
                System.out.println(i + " " + arr[i]);
            }
        }
        ois.close();
    }
}