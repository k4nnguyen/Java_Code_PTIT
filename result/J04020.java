import java.util.*;
public class J04020 {
    static Boolean Prime(Integer n)
    {
        if(n < 2) return false;
        if(n <= 3) return true;
        if(n%2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i*i <= n; i+=6)
            if(n%i == 0 || n%(i+2) == 0) return false;
        return true;
    }

    static class Pair<X,Y>{
        private Integer A,B;
        public Pair(Integer A, Integer B)
        {
            this.A = A;
            this.B = B;
        }
        public Boolean isPrime(){
            return(Prime(A) && Prime(B));
        }
        @Override
        public String toString(){
            String s = A + " " + B;
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
