import java.util.*;
public class J04005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String dob = scanner.next();
        Double a1,a2,a3;
        a1 = scanner.nextDouble();
        a2 = scanner.nextDouble();
        a3 = scanner.nextDouble();
        String[] a = dob.split("/");
        if(a[0].length() == 1)
            a[0] = "0" + a[0];
        if(a[1].length() == 1)
            a[1] = "0" + a[1];
        dob = a[0] + "/" + a[1] + "/" + a[2];
        System.out.printf("%s %s %.1f",s,dob,a1+a2+a3);
    }
}
