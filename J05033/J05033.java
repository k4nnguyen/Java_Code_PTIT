import java.util.*;
public class J05033 {
    // implements Comparable<Time> de so sanh dc = compareTo
    static class Time implements Comparable<Time>{
        private int gio,phut,giay;
        public Time(int gio, int phut, int giay)
        {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        } 
        @Override
        public String toString(){
            String s = this.gio + " " + this.phut + " " + this.giay;
            return s;
        }
        @Override
        public int compareTo(Time x)
        {
            if(this.gio != x.gio) return this.gio - x.gio;
            else if(this.phut != x.phut) return this.phut - x.phut;
            return this.giay - x.giay;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Time[] a = new Time[t];
        for(int i = 0; i<t; i++)
        {
            a[i] = new Time(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        }
        Arrays.sort(a);
        for(Time x:a)
        {
            System.out.println(x);
        }
    }
}
