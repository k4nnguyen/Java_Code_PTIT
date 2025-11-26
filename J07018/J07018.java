import java.io.*;
import java.util.*;
public class J07018 {
    static int cnt = 1;
    public static class SV{
        private String id,ten,lop,dob;
        private double gpa;
        public SV(String ten, String lop, String dob, double gpa)
        {
            this.id = "B20DCCN" + String.format("%03d", cnt++);
            String tmp = "";
            String[] s = ten.trim().toLowerCase().split("\\s+");
            for(int i = 0; i<s.length; i++)
            {
                tmp += Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1);
                if(i != s.length-1)
                    tmp += " ";
            }
            this.ten = tmp;
            this.lop = lop;
            String[] ss = dob.split("/");
            if(ss[0].length() == 1)
                ss[0] = "0" + ss[0];
            if(ss[1].length() == 1)
                ss[1] = "0" + ss[1];
            this.dob = ss[0] + "/" + ss[1] + "/" + ss[2];
            this.gpa = gpa;
        }
        @Override
        public String toString(){
            return this.id + " " + this.ten + " " + this.lop + " " + this.dob + " " + String.format("%.2f", this.gpa);
        }
    }
    public static void main(String[] args) throws IOException,FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        SV[] arr = new SV[n];
        for(int i = 0; i<n; i++){
            sc.nextLine();
            arr[i] = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
        }
        for(SV x:arr)
        {
            System.out.println(x);
        }
    }
}
