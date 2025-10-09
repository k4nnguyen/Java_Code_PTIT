import java.util.*;
class Point {
    private Double x,y;

    public  Point(){
        x = 0.0;
        y = 0.0;
    }
    public Point(Double xx, Double yy)
    {
        x = xx;
        y = yy;
    }
    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public Double getX()
    {
        return x;
    }
    public Double getY()
    {
        return y;
    }

    public Double distance(Point p)
    {
        Double x0,y0;
        x0 = this.x - p.x;
        y0 = this.y - p.y;
        return Math.sqrt(x0*x0 + y0*y0);
    }

    public Double distance(Point p1, Point p2)
    {
        Double x0,y0;
        x0 = p1.x - p2.x;
        y0 = p1.y - p2.y;
        return Math.sqrt(x0*x0 + y0*y0);
    }
}
public class J04001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0)
        {
            Point a = new Point(scanner.nextDouble(),scanner.nextDouble());
            Point b = new Point(scanner.nextDouble(),scanner.nextDouble());
            System.out.printf("%.4f\n",a.distance(a, b));
        }
    }    
}
