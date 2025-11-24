import java.util.*;
public class J05036 {
    static int cnt = 1;
    public static class SP
    {
        private String id,ten,dv;
        private double gia,sl,ban,ship,tmp;
        public SP(String ten, String dv, double gia, double sl)
        {
            this.id = "MH" + String.format("%02d",cnt++);
            this.ten = ten;
            this.dv = dv;
            this.gia = gia;
            this.sl = sl;
            this.ship = (gia*sl)*0.05;
            this.tmp = gia*sl + this.ship;
            this.ban = this.tmp + 0.02*this.tmp;
        }
        @Override
        public String toString(){
            return this.id + " " + this.ten + " " + this.dv + " " + String.format("%.0f", this.ship) + " " + String.format("%.0f", this.tmp) + " " + String.format("%.0f", this.ban);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        SP[] arr = new SP[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new SP(scanner.nextLine(),scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble());
            scanner.nextLine();
        }
        for(SP x:arr)
        {
            System.out.println(x);
        }
    }
}
