import java.util.*;
public class J05023 {
    static class Student{
        private String msv,ten,lop,mail,nam;
        public Student(String msv,String ten,String lop,String mail)
        {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
            this.nam = lop.substring(1,3); 
            // Lưu ý là lấy theo lớp chứ ko phải msv đâu =))))))))))))))))
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
            String s = scanner.next();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n",s);
            for(Student x:arr)
            {
                if(x.nam.equals(s.substring(2)))
                    System.out.println(x);
            }
        }
    }
}

