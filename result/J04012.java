import java.util.Scanner;

class NV{
    private String ID,name,cvu;
    private long luong,ngaycong,thuong,phucap,thunhap;
    public NV(String name, long luong, long ngaycong, String cvu)
    {
        this.ID = "NV01";
        this.name = name;
        this.luong = luong;
        this.ngaycong = ngaycong;
        this.cvu = cvu;
        this.luong = luong*ngaycong;
        this.thuong = 0;

        if(ngaycong >= 25)
            this.thuong = this.luong*20/100;
        else if(ngaycong >= 22)
            this.thuong = this.luong*10/100;
        else
            this.thuong = 0;
        
        if(cvu.equals("GD"))
            this.phucap = 250000;
        else if(cvu.equals("PGD"))
            this.phucap = 200000;
        else if(cvu.equals("TP"))
            this.phucap = 180000;
        else
            this.phucap = 150000;

        this.thunhap = this.luong + this.thuong + this.phucap;
        
    }
//     public String toString(){
//         return this.ID + " " + this.name + " " + this.luong + " " + this.thuong + " " + this.phucap + " " + this.thunhap;
// }
    @Override
    public String toString(){
        return this.ID + " " + this.name + " " + this.luong + " " + this.thuong + " " + this.phucap + " " + this.thunhap;
    }

}
public class J04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NV nv = new NV(scanner.nextLine(),scanner.nextLong(),scanner.nextLong(),scanner.next());
        System.out.println(nv);
    }
}
