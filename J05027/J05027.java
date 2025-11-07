import java.util.*;
public class J05027 {
    public static String getMa(String s)
    {
            String[] ss = s.trim().split("\\s+");
            String tmp = "";
            for(String x:ss)
            {
                tmp += Character.toUpperCase(x.charAt(0));
            }
            return tmp;
    }
    static int cnt = 1;
    public static class GV implements Comparable<GV>{
        private String ten,mon,ma,id,lName;
        public GV(String ten, String mon)
        {
            this.id = "GV" + String.format("%02d",cnt++); 
            this.ten = ten;
            this.mon = mon;
            this.ma = getMa(mon);
            String[] ss = ten.split("\\s+");
            this.lName = ss[ss.length-1];
        }
        @Override
        public String toString(){
            return this.id + " " + this.ten + " " + this.ma;
        }
        public int compareTo(GV a){
            if(this.lName.equals(a.lName))
                return this.ma.compareTo(a.ma);
            return this.lName.compareTo(a.lName);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        GV[] arr = new GV[n];
        for(int i =0; i<n; i++)
        {
            arr[i] = new GV(scanner.nextLine(),scanner.nextLine());
        }
        int q = scanner.nextInt();
        scanner.nextLine();
        while(q-->0)
        {
            String s = scanner.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+ s + ":");
            for(GV x:arr)
            {
                if(x.ten.toLowerCase().contains(s.toLowerCase()))
                    System.out.println(x);
            }
        }
    }
}

