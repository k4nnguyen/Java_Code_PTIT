import java.io.*;
import java.util.*;
class Subject{
    private String ID, name, exam;
    public Subject(String ID, String name, String exam)
    {
        this.ID = ID;
        this.name = name;
        this.exam = exam;
    }
    public String toString(){
        return ID + " " + name + " " + exam;
    }
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int t = scanner.nextInt();
        scanner.nextLine();
        Vector<Subject> v = new Vector<>();
        while(t-->0)
        {
            Subject subject = new Subject(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            v.add(subject);
        }
        Collections.sort(v,new Comparator<Subject>(){
            @Override
            public int compare(Subject a, Subject b){
                if(a.toString().compareTo(b.toString()) > 0)
                    return 1;
                return -1;
            }
        });
        for(Subject x:v)
            System.out.println(x);
        scanner.close();
    }
}


