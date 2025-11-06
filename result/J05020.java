import java.util.*;
public class J05020 {
    static class SV implements Comparable<SV>{
        private String msv,ten,lop,mail;
        public SV(String msv, String ten, String lop, String mail){
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
        }
        @Override
        public String toString(){
            return this.msv + " " + this.ten + " " + this.lop + " " + this.mail;
        }
        @Override
        public int compareTo(SV b)
        {
            if(this.lop.equals(b.lop))
                return this.msv.compareTo(b.msv);
            return this.lop.compareTo(b.lop);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        SV[] a = new SV[n];
        for(int i = 0; i<n; i++)
        {
            a[i] = new SV(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        }
        Arrays.sort(a);
        for(SV x : a)
        {
            System.out.println(x);
        }
    }
}
