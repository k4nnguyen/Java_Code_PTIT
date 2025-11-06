import java.util.*;
public class J05029 {
    static class DN implements Comparable<DN>{
       private String ma,ten;
       private int soLuong;
       public DN(String ma, String ten, int soLuong)
       {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
       }
       @Override
       public String toString(){
        return this.ma + " " + this.ten + " " + this.soLuong;
       }
       @Override
       public int compareTo(DN a)
       {
        if(this.soLuong == a.soLuong)
            return this.ma.compareTo(a.ma);
        return  a.soLuong-this.soLuong ;
       }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        DN[] a = new DN[n];
        for(int i = 0; i<n; i++)
        {
            a[i] = new DN(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
            scanner.nextLine();
        }
        int q = scanner.nextInt();
        while(q-->0)
        {
        int aa,bb;
        aa = scanner.nextInt();
        bb = scanner.nextInt();
        int tmp = 0;
        if(aa > bb)
        {
            tmp = aa;
            aa = bb;
            bb = tmp;
        }
        System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",aa,bb);
        Arrays.sort(a);
        for(DN x : a)
        {   
            if(x.soLuong >= aa && x.soLuong <= bb)
                System.out.println(x);
        }
        }
    }
}
