import java.util.*;
public class J05031 {
    public static class SV implements Comparable<SV>
    {
        private String msv,ten,lop;
        private double d1,d2,d3;
        public SV(String msv, String ten, String lop, double d1, double d2, double d3)
        {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }
        @Override
        public String toString(){
            return this.msv + " " + this.ten + " " + this.lop + " " +  String.format("%.1f",this.d1) + " " + String.format("%.1f",this.d2) + " " + String.format("%.1f",this.d3);
        }
        public int compareTo(SV a)
        {
            return this.ten.compareTo(a.ten);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SV[] arr = new SV[n];
        scanner.nextLine();
        for(int i = 0; i<n; i++)
        {
            arr[i] = new SV(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            scanner.nextLine();
        }
        Arrays.sort(arr);
        int cnt = 1;
        for(SV x: arr)
        {
            System.out.printf("%d ",cnt++);
            System.out.println(x);
        }
    }
}
