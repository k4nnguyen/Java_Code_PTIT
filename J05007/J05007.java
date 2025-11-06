import java.util.*;
public class J05007 {
    static int cnt = 1;
    static class NV implements Comparable<NV>{
        private String ten,gt,dob,dc,mst,ngay;
        private int id,age;
        public NV(String ten,String gt,String dob,String dc,String mst,String ngay)
        {
            this.ten = ten;
            this.gt = gt;
            this.dob = dob;
            this.dc = dc;
            this.mst = mst;
            this.ngay = ngay;
            this.id = cnt++;
            
            String[] s = dob.split("/");
            this.age = Integer.parseInt(s[0]) + Integer.parseInt(s[1]) * 30 + Integer.parseInt(s[2]) * 12 * 30;
        }
        @Override
        public String toString(){
            return String.format("%05d", this.id) + " " + this.ten + " " + this.gt + " " + this.dob + " " + this.dc + " " + this.mst + " " + this.ngay;
        }
        public int compareTo(NV a)
        {
            return  this.age - a.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        NV[] arr = new NV[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new NV(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        }
        Arrays.sort(arr);
        for(NV x:arr)
        {
            System.out.println(x);
        }
    }
}

