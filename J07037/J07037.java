import java.io.*;
import java.util.*;

public class J07037 {
    public static class DN implements Comparable<DN>{
        private String id,ten;
        private int sl;
        public DN(String id, String ten, int sl)
        {
            this.id = id;
            this.ten = ten;
            this.sl = sl;
        }
        @Override
        public String toString(){
            return this.id + " " + this.ten + " " + this.sl;
        }
        public int compareTo(DN a){
            return this.id.compareTo(a.id);
        }
    }
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        DN[] arr = new DN[n];
        for(int i = 0; i<n; i++){
            sc.nextLine();
            arr[i] = new DN(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
        Arrays.sort(arr);
        for(DN x : arr)
        {
            System.out.println(x);
        }
    }
}
