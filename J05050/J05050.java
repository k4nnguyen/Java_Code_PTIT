import java.util.*;
public class J05050 {
    static int cnt = 1;
    public static class KH{
        private String loai,id;
        private long cu,moi,hs,tt,pt,tong;
        public KH(int i,String loai, long cu, long moi)
        {
            this.id = "KH" + String.format("%02d",i);
            this.loai = loai;
            this.cu = cu;
            this.moi = moi;
            if(this.loai.toUpperCase().equals("KD"))
                this.hs = 3;
            else if(this.loai.toUpperCase().equals("NN"))
                this.hs = 5;
            else if(this.loai.toUpperCase().equals("TT"))
                this.hs = 4;   
            else 
                this.hs = 2;      
            this.tt = (this.moi - this.cu) * this.hs * 550;
            if(this.moi - this.cu < 50)
                this.pt = 0;
            else if(this.moi - this.cu <= 100)
                this.pt = Math.round(this.tt * 35 / 100.0);
            else 
                this.pt = this.tt;

            this.tong = this.pt + this.tt;
        }
        @Override
        public String toString(){
            return this.id + " " + this.hs + " " + this.tt + " " + this.pt + " " + this.tong;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        KH[] arr = new KH[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new KH(i+1,scanner.next(),scanner.nextLong(),scanner.nextLong());
        }
        for(KH x:arr)
        {
            System.out.println(x);
        }
    }
}