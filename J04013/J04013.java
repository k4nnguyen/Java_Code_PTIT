import java.util.*;
import java.text.DecimalFormat;
class TuyenSinh{
    private String ma,name,trungTuyen;
    private float d1,d2,d3,uuTien;
    DecimalFormat df = new DecimalFormat("#.#"); // chỉ in 1 số lẻ nếu có
    public TuyenSinh(String ma,String name, float d1, float d2, float d3){
        d1 *=2;
        this.ma = ma;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.uuTien = 0;
        this.trungTuyen = "TRUOT";
        if(this.ma.charAt(2) == '1')
            this.uuTien = (float)0.5;
        else if(ma.charAt(2) == '2')
            this.uuTien = (float)1;
        else
            this.uuTien = (float)2.5;
        if(d1+d2+d3+this.uuTien >= 24)
            this.trungTuyen = "TRUNG TUYEN";
    }
    public void Out(){
        System.out.printf("%s %s %s %s %s",this.ma,this.name,df.format(this.uuTien),df.format(d1+d2+d3),this.trungTuyen);
    }
}

public class J04013{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String ma = scanner.next();
        scanner.nextLine();
        TuyenSinh a = new TuyenSinh(ma,scanner.nextLine(),scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat());
        a.Out();
    }
}
