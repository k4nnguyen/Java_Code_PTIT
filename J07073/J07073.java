import java.io.*;
import java.util.*;
public class J07073 {
    public static class MH implements Comparable<MH>
    {
        private String id,ten,ht,link;
        private int tin;
        public MH(String id, String ten, int tin, String ht, String link)
        {
            this.id = id;
            this.ten = ten;
            this.tin = tin;
            this.ht = ht;
            this.link = link;
        }
        @Override
        public String toString(){
            return this.id + " " + this.ten + " " + this.tin + " " + this.ht + " " + this.link;
        }
        public int compareTo(MH a){
            return this.id.compareTo(a.id);
        }
    }
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        MH[] arr = new MH[n];
        for(int i = 0; i<n; i++){
            String id,ten,ht,link;
            int tin;
            id = sc.nextLine();
            ten = sc.nextLine();
            tin = sc.nextInt();
            sc.nextLine();
            ht = sc.nextLine();
            link = sc.nextLine();
            arr[i] = new MH(id,ten,tin,ht,link);
        }
        Arrays.sort(arr);
        for(MH x:arr)
        {
            if(x.link.endsWith(".ptit.edu.vn") || x.link.compareTo("Truc tuyen") == 0)
                System.out.println(x);
        }
    }    
}
