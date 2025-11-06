import java.util.*;
public class J05006 {
    static int cnt = 1;
    static class NV{
        private String ten,gt,dob,dc,mst,ngay;
        private int id;
        public NV(String ten,String gt,String dob,String dc,String mst,String ngay)
        {
            this.ten = ten;
            this.gt = gt;
            this.dob = dob;
            this.dc = dc;
            this.mst = mst;
            this.ngay = ngay;
            this.id = cnt++;
        }
        @Override
        public String toString(){
            return String.format("%05d", this.id) + " " + this.ten + " " + this.gt + " " + this.dob + " " + this.dc + " " + this.mst + " " + this.ngay;
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
        for(NV x:arr)
        {
            System.out.println(x);
        }
    }
}

