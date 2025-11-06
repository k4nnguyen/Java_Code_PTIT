import java.util.*;
public class J05032 {
    static class Student implements Comparable<Student>{
        private String ten,dob;
        private int ss;
        public Student(String ten,String dob)
        {
            this.ten = ten;
            String[] tmp = dob.split("/");
            if(tmp[0].length() == 1) tmp[0] = "0" + tmp[0];
            if(tmp[1].length() == 1) tmp[1] = "0" + tmp[1];
            this.dob = tmp[0] + "/" + tmp[1] + "/" + tmp[2];
            this.ss = Integer.parseInt(tmp[0]) * 24 + Integer.parseInt(tmp[1]) * 30 * 24 +Integer.parseInt(tmp[2]) * 30 * 24 * 365;
        }
        @Override
        public String toString(){
            return this.ten;
        }
        @Override
        public int compareTo(Student a){
            return this.ss - a.ss;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] arr = new Student[n];
        for(int i = 0; i<n; i++)
        {
            String ten = scanner.next();
            String dob = scanner.next();
            scanner.nextLine();
            arr[i] = new Student(ten,dob);
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        System.out.println(arr[0]);
    }
}
