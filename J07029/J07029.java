import java.io.*;
import java.util.*;
public class J07029 {
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
    static int[] arr = new int[1000001];
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        for(Integer i:l)
        {
            arr[i]++;
        }
        int cnt = 0;
        for(int i = 1000000; i>=2; i--)
        {
            if(arr[i] > 0 && prime(i) == true)
            {
                System.out.println(i + " " + arr[i]);
                cnt++;
            }
            if(cnt == 10)
                break;
        }
        ois.close();
    }
}
