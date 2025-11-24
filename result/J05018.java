import java.util.*;
import java.text.DecimalFormat;

public class main {
    static int count = 1;
    public static class Score{
        private double value;
        public Score(double value){
            setValue(value);
        }
        public void setValue(double value)
        {
            if(value >= 0 && value <= 10)
                    this.value = value;
        }
        public double getValue()
        {
            return this.value;
        }
    }
    
    public static class HS implements Comparable<HS>{
        private String name,msv,loai;
        private List<Score> diem = new ArrayList<>();
        private double tb;
        public HS(String name,double... values)
        {
            msv = "HS" + String.format("%02d",count++);
            setName(name);
            for(double x:values)
                    this.diem.add(new Score(x));
            setTb(this.diem);
            if(this.tb >= 9)
                loai = "XUAT SAC";
            else if (this.tb >= 8)
                loai = "GIOI";
            else if (this.tb >= 7)
                loai = "KHA";
            else if (this.tb >= 5)
                loai = "TB";
            else
                loai = "YEU";
        }
        public void setName(String name)
        {
            if(!name.equals(""))
                this.name = name;
        }
        public void setTb(List<Score> a)
        {
            double r = 0;
            int c = 0;
            for(Score x:a)
            {
                if(c == 0 || c == 1)
                    r += x.getValue()*2;
                else
                    r += x.getValue();
                c++;
            }
            r /= (c+2);
            this.tb = Math.round(r*10.0)/10.0;
        }
        @Override
        public String toString(){
            return this.msv + " " + this.name + " " + String.format("%.1f",this.tb) + " " + this.loai;
        }
        public int compareTo(HS a){
            if(this.tb == a.tb)
                return this.msv.compareTo(a.msv);
            return (this.tb < a.tb)?1:-1;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        HS[] arr = new HS[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new HS(scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
            scanner.nextLine();
        }
        Arrays.sort(arr);
        for(HS x:arr)
        {
            System.out.println(x);
        }
    }
    
}


