import java.util.*;

class NV{
    private String id;
    private String ten;
    private String gt;
    private String dob;
    private String dc;
    private String mst;
    private String hd;
    public NV(String ten, String gt, String dob, String dc, String mst, String hd)
    {
        this.id = "00001";
        this.ten = ten;
        this.gt = gt;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;

        String[] wrds = dob.split("/");
        if(wrds[0].length() == 1)
            wrds[0] = "0" + wrds[0];
        if(wrds[1].length() == 1)
            wrds[1] = "0" + wrds[1];
        this.dob = wrds[0] + "/" + wrds[1] + "/" + wrds[2];
    }
    public void Out()
    {
        System.out.printf("%s %s %s %s %s %s %s",id,ten,gt,dob,dc,mst,hd);
    }
}
public class J04007{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        NV a = new NV(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        a.Out();
    }   
}
