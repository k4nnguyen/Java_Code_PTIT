import java.util.*;
public class J05047 {
    public static class SP implements Comparable<SP>{
        private String name,ma;
        private int sl,dg,ck,tong;
        public SP(String name, int sl, int dg, Map<String,Integer> cnt)
        {
            this.name = name;
            this.sl = sl;
            this.dg = dg;
            this.ma = "" + Character.toUpperCase(name.charAt(0));
            for(int i = 1; i<name.length(); i++)
            {
                if(name.charAt(i-1) == ' ')
                {
                    this.ma += Character.toUpperCase(name.charAt(i));
                    break;
                }
            }
            if(sl < 5)
                this.ck = 0;
            else if(sl < 8)
                this.ck = 1;
            else if(sl <= 10)
                this.ck = 2;
            else
                this.ck = 5;
            
            if(cnt.containsKey(this.ma))
            {
                int count = cnt.get(this.ma) + 1;
                cnt.put(this.ma, count);
                this.ma += String.format("%02d",count);
            }
            else{
                cnt.put(this.ma,1);
                this.ma += String.format("%02d",cnt.get(this.ma));
            }
            this.ck = this.dg * this.sl * this.ck/100;
            this.tong = this.dg * this.sl - this.ck;
        }
        @Override
        public String toString(){
            return this.ma + " " + this.name + " " + this.ck + " " + this.tong;
        }
        @Override
        public int compareTo(SP a){
            return -this.ck + a.ck;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        SP[] arr = new SP[n];
        Map<String,Integer> cnt = new HashMap<>();
        for(int i = 0; i<n; i++)
        {
            arr[i] = new SP(scanner.nextLine(),scanner.nextInt(),scanner.nextInt(),cnt);
            scanner.nextLine();
        }
        Arrays.sort(arr);
        for(SP x:arr)
        {
            System.out.println(x);
        }    
    }
}
