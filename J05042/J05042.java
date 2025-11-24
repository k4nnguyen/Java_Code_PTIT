import java.util.*;
public class J05042 {
    public static class SV implements Comparable<SV>{
        private String name;
        private int bai,sub;
        public SV(String name, int bai, int sub)
        {
            this.name = name;
            this.bai = bai;
            this.sub = sub;
        }
        @Override
        public String toString(){
            return this.name + " " + this.bai + " " + this.sub;
        }
        public int compareTo(SV a){
            if(this.bai == a.bai)
                return this.sub - a.sub;
            return a.bai - this.bai;
            }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        SV[] arr = new SV[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new SV(scanner.nextLine(),scanner.nextInt(),scanner.nextInt());
            scanner.nextLine();
        }
        Arrays.sort(arr);
        for(SV x:arr)
        {
            System.out.println(x);
        }
    }
    
}
