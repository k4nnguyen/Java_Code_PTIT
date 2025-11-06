import java.util.*;
public class J05022 {
    static class Student{
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
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] arr = new Student[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        }
        int q = scanner.nextInt();
        scanner.nextLine();
        while(q-->0)
        {
            String s = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for(Student x:arr)
            {
                if(x.lop.equals(s))
                    System.out.println(x);
            }
        }
    }
}
