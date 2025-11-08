import java.util.*;
public class J05040 {
    static int cnt = 1;
    public static class NV{
        private String id,name,cv;
        private double luong,ngay,goc,pc,tong,thuong;
        public NV(String name, double luong, double ngay, String cv)
        {
            this.id = "NV" + String.format("%02d", cnt++);
            this.name = name;
            this.luong = luong;
            this.ngay = ngay;
            this.cv = cv;
            if(cv.equals("GD"))
                this.thuong = 250000;
            else if(cv.equals("PGD"))
                this.thuong = 200000;
            else if(cv.equals("TP"))
                this.thuong = 180000;
            else 
                this.thuong = 150000;
            double tmp = luong*ngay;
            this.goc = tmp;
            if(ngay < 22)
                this.pc = 0;
            else if(ngay < 25)
                this.pc = tmp*0.1;
            else
                this.pc = tmp*0.2;
            tmp += this.pc;
            this.tong = tmp + this.thuong;
        }
        @Override
        public String toString(){
            return this.id + " " + this.name + " " + String.format("%.0f", this.goc) + " " + String.format("%.0f", this.pc) + " " + String.format("%.0f", this.thuong) + " " + String.format("%.0f", this.tong);
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
            luong = scanner.nextDouble();
            ngay = scanner.nextDouble();
            scanner.nextLine();
            cv = scanner.nextLine();
            arr[i] = new NV(name,luong,ngay,cv);
        }
        for(NV x:arr)
        {
            System.out.println(x);
        }
    }
    
}
