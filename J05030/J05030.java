import java.util.*;
public class J05030 {
    static class Student implements Comparable<Student>{
        private String msv,ten,lop;
        private float d1,d2,d3;
        public Student(String msv,String ten,String lop,float d1,float d2,float d3)
        {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }
        @Override
        public String toString(){
            return this.msv + " " + this.ten + " " + this.lop + " " + this.d1 + " " + this.d2 + " " + this.d3;
        }
        public int compareTo(Student a){
            return this.msv.compareTo(a.msv);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] arr = new Student[n];
        for(int i = 0; i<n; i++)
        {
            String msv,ten,lop;
            float d1,d2,d3;
            msv = scanner.nextLine();
            ten = scanner.nextLine();
            lop = scanner.nextLine();
            d1 = scanner.nextFloat();
            d2 = scanner.nextFloat();
            d3 = scanner.nextFloat();
            scanner.nextLine();
            arr[i] = new Student(msv,ten,lop,d1,d2,d3);
        }
        Arrays.sort(arr);
        for(int i = 0; i<n; i++)
        {
            System.out.printf("%d ",i+1);
            System.out.println(arr[i]);
        }
    }
}
