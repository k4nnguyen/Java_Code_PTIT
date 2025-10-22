import java.util.*;
public class J05011 {
    static class Time implements Comparable<Time>{
        private String id,ten,start,end;
        private int gio,phut,total;
        public Time(String id, String ten, String start, String end)
        {
            this.id = id;
            this.ten = ten;
            this.start = start;
            this.end = end;
            this.gio = Integer.parseInt(this.end.substring(0, 2)) - Integer.parseInt(this.start.substring(0, 2));
            this.phut = Integer.parseInt(this.end.substring(3)) - Integer.parseInt(this.start.substring(3));
            if(this.phut < 0)
            {
                this.gio--;
                this.phut += 60;
            }
            this.total = gio * 60 + phut;
        }
        @Override
        public String toString(){
            return this.id + " " + this.ten + " " + this.gio + " gio " + this.phut + " phut";
        }
        public int compareTo(Time a){
            return a.total - this.total;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Time[] arr = new Time[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new Time(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        }
        Arrays.sort(arr);
        for(Time x:arr)
        {
            System.out.println(x);
        }
    }
}
