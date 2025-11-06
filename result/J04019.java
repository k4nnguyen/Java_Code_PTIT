import java.util.*;
    class Point{
    double x,y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    static Point nextPoint(Scanner scanner){
        Point a = new Point(scanner.nextDouble(),scanner.nextDouble());
        return a;
    }
    static double distance(Point a, Point b)
    {
    return Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y));
    }

}
class Triangle{
    double A,B,C;
    public Triangle(Point a, Point b, Point c)
    {
        A = a.distance(a, b);
        B = a.distance(a, c);
        C = a.distance(b, c);
    }
    public Boolean valid()
    {
        return (this.A + this.B > this.C && this.A + this.C > this.B && this.C + this.B > this.A );
    }
    public String getPerimeter(){
        return String.format("%.3f", this.A+this.B+this.C);
    }
}
public class J04019{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
