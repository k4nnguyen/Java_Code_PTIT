import java.util.*;
public class J05010 {
    static int cnt = 1;
    static class Stuff implements Comparable<Stuff>{
        private String ten,loai;
        private int id;
        private float buy,sell,value;
        public Stuff(String ten, String loai, float buy, float sell)
        {
            this.id = cnt++;
            this.ten = ten;
            this.loai = loai;
            this.value = sell - buy;
        }
        @Override
        public String toString(){
            return this.id + " " + this.ten + " " + this.loai + " " + String.format("%.2f", this.value);
        }
        public int compareTo(Stuff a){
            return (a.value > this.value)? 1:-1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Stuff[] arr = new Stuff[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new Stuff(scanner.nextLine(),scanner.nextLine(),scanner.nextFloat(),scanner.nextFloat());
            scanner.nextLine();
        }
        Arrays.sort(arr);
        for(Stuff x:arr)
        {
            System.out.println(x);
        }
    }
}
