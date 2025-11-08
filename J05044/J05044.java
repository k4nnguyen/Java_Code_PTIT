import java.util.*;
public class J05044 {
    static int cnt = 1;
    public static class NV{
        private String id,name,cv;
        private double luong,ngay,goc,tong,thuong,ung;
        public NV(String name, String cv, double luong, double ngay)
        {
            this.id = "NV" + String.format("%02d", cnt++);
            this.name = name;
            this.luong = luong;
            this.ngay = ngay;
            this.cv = cv;
            if(cv.equals("GD"))
                this.thuong = 500;
            else if(cv.equals("PGD"))
                this.thuong = 400;
            else if(cv.equals("TP"))
                this.thuong = 300;
            else if(cv.equals("KT"))
                this.thuong = 250;
            else
                this.thuong = 100;
            this.goc = luong*ngay;
            if(((this.thuong + this.goc) * 2 / 3) < 25000)
                this.ung = Math.round((this.thuong + this.goc) * 2 / 3/1000) * 1000;
            else
                this.ung = 25000;
            this.tong = this.goc + this.thuong - this.ung;
        }
        @Override
        public String toString(){
            return this.id + " " + this.name + " " + String.format("%.0f", this.thuong) + " " + String.format("%.0f", this.goc) + " " + String.format("%.0f", this.ung) + " " + String.format("%.0f", this.tong);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        NV[] arr = new NV[n];
        for(int i = 0; i<n; i++)
        {
            String name,cv;
            double luong,ngay;
            name = scanner.nextLine();
            cv = scanner.nextLine();
            luong = scanner.nextDouble();
            ngay = scanner.nextDouble();
            scanner.nextLine();
            arr[i] = new NV(name,cv,luong,ngay);
        }
        String tmp = scanner.nextLine();
        for(NV x:arr)
        {
            if(x.cv.equals(tmp))
                System.out.println(x);
        }
    }
    
}
