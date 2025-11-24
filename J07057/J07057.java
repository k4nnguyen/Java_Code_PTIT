import java.util.*;
import java.io.*;
public class J07057 {
public static int cnt = 1;
public static String solve(String s)
{
    String[] ss = s.trim().split("\\s+");
    String res = "";
    for(int i = 0; i<ss.length; i++)
    {
        ss[i] = ss[i].toLowerCase();
        res = res + Character.toUpperCase(ss[i].charAt(0)) + ss[i].substring(1);
        if(i != ss.length-1) res += " ";
    }
    return res;
}
public static class TS implements Comparable<TS>{
    private String id,ten,dt,tt;
    private float tong;
    private int kv;
    public TS(String ten, float tong, String dt, int kv)
    {
        this.id = "TS" + String.format("%02d",cnt++);
        this.tt = "Truot";
        this.ten = solve(ten);
        this.tong = tong;
        this.dt = dt;
        this.kv = kv;
        if(kv == 1)
            this.tong += 1.5;
        else if(kv == 2)
            this.tong += 1;
        if(!dt.toLowerCase().equals("kinh"))
            this.tong += 1.5;
        if(this.tong >= 20.5)
            this.tt = "Do";
    }
    @Override
    public String toString(){
        return this.id + " " + this.ten + " " + String.format("%.1f", this.tong) + " " + this.tt;
    }
    public int compareTo(TS a){
        if (this.tong != a.tong)
            return Float.compare(a.tong, this.tong); // giảm dần
        return this.id.compareTo(a.id); 
    }
}
    public static void main(String[] args) throws IOException, FileNotFoundException{
    Scanner scanner = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(scanner.nextLine().trim());
        TS[] arr = new TS[n];
        for(int i = 0; i<n; i++)
        {
            String ten = scanner.nextLine();
            float diem = Float.parseFloat(scanner.nextLine().trim());
            String dt = scanner.nextLine();
            int kv = Integer.parseInt(scanner.nextLine().trim());
            arr[i] = new TS(ten,diem,dt,kv);
        }
        Arrays.sort(arr);
        for(TS x:arr)
        {
            System.out.println(x);
        }
    
}    
}
