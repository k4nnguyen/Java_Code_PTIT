import java.util.*;
public class J05024 {
    static class Student{
        private String msv,ten,lop,mail,nganh;
        public Student(String msv, String ten, String lop, String mail)
        {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
            this.nganh = msv.substring(3,7);
            if(this.nganh.equals("CN") || this.nganh.equals("AT")) this.nganh += "D";
        }

        @Override
        public String toString(){
            return this.msv + " " + this.ten + " " + this.lop + " " + this.mail;
        }
    }
    public static void main(String[] args)
    {
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
            String ss = scanner.nextLine().toLowerCase();
            String s = "";
            if(ss.equals("ke toan"))
                s = "DCKT";
            else if(ss.equals("cong nghe thong tin"))
                s = "DCCN";
            else if(ss.equals("an toan thong tin"))
                s = "DCAT";
            else if(ss.equals("vien thong"))
                s = "DCVT";
            else if(ss.equals("dien tu"))
                s = "DCDT";
            ss = ss.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + ss + ":");
            for(Student x:arr)
            {
                if(x.nganh.equals(s))
                {
                    if((s.equals("DCCN") || s.equals("DCAT")) && x.lop.charAt(0) == 'E')
                        continue; 
                    System.out.println(x);
                }
            }
        }
    }
}

