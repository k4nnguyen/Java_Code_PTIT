import java.util.*;
public class J04015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cvu = scanner.next();
        scanner.nextLine();
        String ten = scanner.nextLine();
        long luong = scanner.nextLong();
        int bac = (cvu.charAt(2) - '0')*10 + (cvu.charAt(3)-'0');
        long phucap = 0;
        if(cvu.charAt(0) == 'H' && cvu.charAt(1) == 'P')
            phucap = 900000;
        else if(cvu.charAt(0) == 'H' && cvu.charAt(1) == 'T')
            phucap = 2000000;
        else if(cvu.charAt(0) == 'G' && cvu.charAt(1) == 'V')
            phucap = 500000;
        luong = luong*bac + phucap;
        System.out.printf("%s %s %d %d %d",cvu,ten,bac,phucap,luong);
    }
}
// luong*bac + phucap

