import java.util.*;
public class J05021 {
    static class Student implements Comparable<Student>{
        private String msv,ten,lop,mail;
        public Student(String msv,String ten,String lop,String mail)
        {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
        }
        @Override
        public String toString(){
            return this.msv + " " + this.ten + " " + this.lop + " " + this.mail;
        }
        public int compareTo(Student a){
            return this.msv.compareTo(a.msv);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] arr = new Student[10000];
        int cnt = 0;
        while(scanner.hasNextLine())
        {
            arr[cnt++] = new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        }
        Arrays.sort(arr,0,cnt);
        for(int i = 0; i<cnt; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
