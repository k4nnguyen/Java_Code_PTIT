import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class J07010 {
    static int cnt = 1;
    public static class SV{
        private String msv,name,lop,dob;
        private double gpa;
        public SV(String name, String lop, String dob, double gpa)
        {
            this.msv = "B20DCCN" + String.format("%03d",cnt++);
            this.name = name;
            this.lop = lop;
            String[] s = dob.split("/");
            if(s[0].length() == 1) s[0] = "0" + s[0];
            if(s[1].length() == 1) s[1] = "0" + s[1];
            this.dob = s[0] + "/" + s[1] + "/" + s[2];
            this.gpa = gpa;
        }
        @Override
        public String toString(){
            return this.msv + " " + this.name + " " + this.lop + " " + this.dob + " " + String.format("%.02f",this.gpa);
        }
    }
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        SV[] arr = new SV[n];
        for(int i = 0; i<n; i++)
        {
            sc.nextLine();
            arr[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        for(SV x:arr)
        {
            System.out.println(x);
        }
    }
}
