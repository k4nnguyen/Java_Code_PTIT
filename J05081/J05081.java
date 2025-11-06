import java.util.*;
public class J05081 {
    static int cnt = 1;
    static class Hang implements Comparable<Hang>
    {
        private String ten,kieu;
        private int mua,ban,loi,id;
        public Hang(String ten, String kieu, int mua, int ban)
        {
            this.id = cnt++;
            this.ten = ten;
            this.kieu = kieu;
            this.mua = mua;
            this.ban = ban;
            this.loi = ban-mua;
        }  
        
        @Override
        public String toString(){
            return "MH" + String.format("%03d", this.id) + " " + this.ten + " " + this.kieu + " " 
            + this.mua + " " + this.ban + " " + this.loi;  
        }
        public int compareTo(Hang a){
            if(this.loi == a.loi)
                return this.id - a.id;
            return  a.loi - this.loi ;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine();
        Hang[] arr = new Hang[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new Hang(scanner.nextLine(),scanner.nextLine(),scanner.nextInt(),scanner.nextInt());
            scanner.nextLine();
        }
        Arrays.sort(arr);
        for(Hang x:arr)
        {
            System.out.println(x);
        }
    }
}
