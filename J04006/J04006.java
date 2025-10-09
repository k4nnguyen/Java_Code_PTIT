import java.util.*;

class Student {
    private String name,lop,dob,maSV;
    private double GPA;

    public Student()
    {
        maSV = "";
        name = "";
        lop = "";
        dob = "";
        GPA = 0.0;
    }
    public void Input(){
        Scanner scanner = new Scanner(System.in);
        maSV="B20DCCN001";
        name = scanner.nextLine();
        lop = scanner.next();
        dob = scanner.next();
        GPA = scanner.nextDouble();

        String[] a = dob.split("/");
        if(a[0].length()==1)
            a[0] = "0" + a[0];
        if(a[1].length()==1)
            a[1] = "0" + a[1];
        dob = a[0] + "/" + a[1] + "/" + a[2];    
    }
    public void Output()
    {
        System.out.printf("%s %s %s %s %.2f",maSV,name,lop,dob,GPA);
    }
}
public class J04006 {
    public static void main(String[] args) {
        Student st = new Student();
        st.Input();
        st.Output();
    }
}