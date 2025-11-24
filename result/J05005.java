import java.util.*;
import java.text.DecimalFormat;

public class main {
    static int cnt = 1;
    public static class SV implements Comparable<SV>{
        private String msv,ten,lop,dob;
        private double gpa;

        public SV(String ten, String lop, String dob, double gpa) {
            this.msv = "B20DCCN" + String.format("%03d",cnt++);
            setLop(lop);
            setGpa(gpa);
            String s[] = dob.split("/");
            if(s[0].length() == 1)
                    s[0] = "0" + s[0];
            if(s[1].length() == 1)
                    s[1] = "0" + s[1];
            dob = s[0] + "/" + s[1] + "/" + s[2];
            setDob(dob);
            
            s = ten.toLowerCase().trim().split("\\s+");
            String r = "";
            for(int i = 0; i<s.length; i++)
            {
                r += Character.toString(s[i].charAt(0)).toUpperCase() + s[i].substring(1) + " ";
            }
            setTen(r);
        }
        

        public void setTen(String ten) {
            if(!ten.equals(""))
                this.ten = ten;
        }

        public void setLop(String lop) {
            if(!lop.equals(""))    
                    this.lop = lop;
        }

        public void setDob(String dob) {
            if(!dob.equals(""))
                this.dob = dob;
        }

        public void setGpa(double gpa) {
            if(gpa >= 0 && gpa <= 4)
                this.gpa = gpa;
        }
        
        public String getMsv() {
            return msv;
        }

        public String getTen() {
            return ten;
        }

        public String getLop() {
            return lop;
        }

        public String getDob() {
            return dob;
        }

        public double getGpa() {
            return gpa;
        }
        @Override
        public String toString(){
            return this.msv + " " + this.ten + this.lop + " " + this.dob + " " + String.format("%.2f",this.gpa);
        }
        public int compareTo(SV a){
            return (this.gpa < a.gpa)? 1:-1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        SV[] arr = new SV[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new SV(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextDouble());
            scanner.nextLine();
        }
        Arrays.sort(arr);
        for(SV x:arr)
        {
            System.out.println(x);
        }
    }
}

//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0
