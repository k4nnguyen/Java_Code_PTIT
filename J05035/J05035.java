import java.util.*;
public class J05034 {
    static int cnt = 1;
    public static class SV implements Comparable<SV>{
        String msv,ten,lop,mail,tt;
        int id;
        public SV(String msv, String ten, String lop, String mail, String tt)
        {
            this.id = cnt++;
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
            this.tt = tt;
        }
        @Override
        public String toString(){
            return this.id + " " + this.msv + " " + this.ten + " " + this.lop + " " + this.mail + " " + this.tt;
        }
        public int compareTo(SV a){
            return this.msv.compareTo(a.msv);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        SV[] arr = new SV[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new SV(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),scanner.nextLine(), scanner.nextLine());
        }
        Arrays.sort(arr);
        int q = scanner.nextInt();
        scanner.nextLine();
        while(q-->0)
        {
            String s = scanner.nextLine();
            for(int i = 0; i<n; i++)
            {
                if(arr[i].tt.equals(s))
                    System.out.println(arr[i]);
            }
        }
    }
}
