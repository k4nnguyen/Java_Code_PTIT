import java.io.*;
import java.util.*;
public class J07033 {
    public static class SV implements Comparable<SV>{
        private String msv,name,lop,mail;
        public SV(String msv, String name, String lop, String mail)
        {
            this.msv = msv;
            String[] s = name.trim().toLowerCase().split("\\s+");
            String tmp = "";
            for(int i = 0; i<s.length; i++)
            {
                tmp += Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1);
                if(i != s.length-1)
                    tmp += " ";
            }
            this.name = tmp;
            this.lop = lop;
            this.mail = mail;
        }
        @Override
        public String toString()
        {
            return this.msv + " " + this.name + " " + this.lop + " " + this.mail;
        }
        public int compareTo(SV a){
            return this.msv.compareTo(a.msv);
        }
    }    
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        SV[] arr = new SV[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(arr);
        for(SV x:arr)
        {
            System.out.println(x);
        }
    }
}
