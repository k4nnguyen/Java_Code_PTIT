import java.util.*;
public class J05041 {
    static int cnt = 1;
    public static class NV implements Comparable<NV>{
        private String id,name,cv;
        private double luong,ngay,goc,tong,thuong,pc;
        public NV(String name, double luong, double ngay, String cv)
        {
            this.id = "NV" + String.format("%02d", cnt++);
            this.name = name;
            this.luong = luong;
            this.ngay = ngay;
            this.cv = cv;
            if(cv.equals("GD"))
                this.pc = 250000;
            else if(cv.equals("PGD"))
                this.pc = 200000;
            else if(cv.equals("TP"))
                this.pc = 180000;
            else if(cv.equals("NV"))
                this.pc = 150000;
            this.goc = luong*ngay;
            if(ngay >= 25)
                this.thuong = this.goc * 0.2;
            else if(ngay >= 22)
                this.thuong = this.goc * 0.1;
            else
                this.thuong = 0;
            this.tong = this.goc + this.thuong + this.pc;
        }
        @Override
        public String toString(){
            return this.id + " " + this.name + " " + String.format("%.0f", this.goc) + " " + String.format("%.0f", this.thuong) + " " + String.format("%.0f", this.pc) + " " + String.format("%.0f", this.tong);
        }
        public int compareTo(NV a){
            return (this.tong < a.tong)? 1:-1;
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
        Arrays.sort(arr);
        for(NV x:arr)
        {
            System.out.println(x);
        }
    }
    
}
