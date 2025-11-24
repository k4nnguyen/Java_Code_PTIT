import java.io.*;
public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.in"));
        int[] arr = new int[1001];
        for(int i = 0; i<100000; i++)
        {
            arr[dt.readInt()]++;
        }
        for(int i = 0; i<1000; i++)
        {
            if(arr[i] > 0)
                System.out.println(i + " " + arr[i]);
        }
        dt.close();

    }
}
