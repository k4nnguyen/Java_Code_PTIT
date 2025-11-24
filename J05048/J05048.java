import java.util.*;
public class J05048 {
    public static class SP{
        private String name;
        private long nhap,xuat,dg,tien,thue;
        public SP(String name, long nhap)
        {
            this.name = name;
            this.nhap = nhap;
            if(Character.toLowerCase(name.charAt(0)) == 'a')
                this.xuat = Math.round(nhap * 0.6);
            else if(Character.toLowerCase(name.charAt(0)) == 'b')
                this.xuat = Math.round(nhap * 0.7);
            if(Character.toLowerCase(name.charAt(name.length()-1)) == 'y')
                this.dg = 110000;
            else
                this.dg = 135000;
            this.tien = this.xuat * this.dg;
            if(Character.toLowerCase(name.charAt(0)) == 'a' && Character.toLowerCase(name.charAt(name.length()-1)) == 'y')
                this.thue = this.tien * 8 / 100;
            else if(Character.toLowerCase(name.charAt(0)) == 'a' && Character.toLowerCase(name.charAt(name.length()-1)) == 'n')
                this.thue = this.tien * 11 / 100;
            else if(Character.toLowerCase(name.charAt(0)) == 'b' && Character.toLowerCase(name.charAt(name.length()-1)) == 'y')
                this.thue = this.tien * 17 / 100;
            else if(Character.toLowerCase(name.charAt(0)) == 'b' && Character.toLowerCase(name.charAt(name.length()-1)) == 'n')
                this.thue = this.tien * 22 / 100;
        }
        @Override
        public String toString()
        {
            return this.name + " " + this.nhap + " " + this.xuat + " " + this.dg + " " + this.tien + " " + this.thue;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SP[] arr = new SP[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new SP(scanner.next(), scanner.nextLong());
        }
        for(SP x:arr)
        {
            System.out.println(x);
        }
    }
}
