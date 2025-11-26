import java.io.*;
import java.util.*;
public class J07034 {
    public static class MH implements Comparable<MH>{
        private String id,ten;
        private int tin;
        public MH(String id, String ten, int tin)
        {
            this.id = id;
            this.ten = ten;
            this.tin = tin;
        }
        @Override
        public String toString(){
            return this.id + " " + this.ten + " " + this.tin;
        }
        public int compareTo(MH a)
        {
            return this.ten.compareTo(a.ten);
        }
    }
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        MH[] arr = new MH[n];
        for(int i = 0; i<n; i++){
            sc.nextLine();
            arr[i] = new MH(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(arr);
        for(MH x:arr)
        {
            System.out.println(x);
        }
    }
}
