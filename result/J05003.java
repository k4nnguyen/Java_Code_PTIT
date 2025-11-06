import java.util.*;
public class J05003 {
    static class SV{
        private static int ID = 1; 
        private String name,lop,dmy,maSV;
        float gpa;
        public SV(String name, String lop, String dmy, float gpa)
        {
            this.name = name;
            this.lop = lop;
            this.gpa = gpa;
            String tmp = "B20DCCN";
            this.maSV = String.format("%s%03d", tmp,ID++);
            String[] t = dmy.split("/");
            if(t[0].length() == 1)
                t[0] = "0"+t[0];
            if(t[1].length() == 1)
                t[1] = "0"+t[1];
            this.dmy = t[0] + "/" + t[1] + "/" + t[2];    
        }
        @Override
        public String toString(){

            return this.maSV + " " + this.name + " " + this.lop + " " + this.dmy + " " + String.format("%.2f",this.gpa);
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    scanner.nextLine();
    SV[] a = new SV[t];
    for(int i = 0; i<t; i++)
    {
        a[i] = new SV(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextFloat());
        scanner.nextLine();
    }
    for(SV x:a)
    {
        System.out.println(x);
    }
}
}
