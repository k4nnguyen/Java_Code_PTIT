import java.util.*;
public class J05009 {
    static int cnt = 1;
    static class Student implements Comparable<Student>{
            private String name,dob;
            private double d1,d2,d3,total;
            private int stt;
            public Student(String name, String dob, double d1, double d2, double d3)
            {
                this.name = name;
                this.dob = dob;
                this.d1 = d1;
                this.d2 = d2;
                this.d3 = d3;
                this.stt = cnt++;
                this.total = this.d1 + this.d2 + this.d3;
            }
            @Override
            public String toString(){
                return this.stt + " " + this.name + " " + this.dob + " " + this.total;
            }
            public int compareTo(Student a){
                if(this.total == a.total)
                {
                    return this.stt - a.stt;
                }
                return (this.total <a.total)? 1:-1;
            }
        } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] arr = new Student[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = new Student(scanner.nextLine(),scanner.next(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
            scanner.nextLine();
        }
        Arrays.sort(arr);
        double d = arr[0].total;
        for(Student a:arr)
        {
            if(a.total == d) System.out.println(a);
            else break;
        }
    }
}



