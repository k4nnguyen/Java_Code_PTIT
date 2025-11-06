import java.util.*;
class Point{
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point p){
        return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
    }

}
public class J04010 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while(t-->0)
    {
        Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point p3 = new Point(scanner.nextDouble(), scanner.nextDouble());
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double p = (a + b + c) / 2;
        if(a + b <= c || a + c <= b || b + c <= a)
        {
            System.out.printf("INVALID\n");
        }
        else
        {
            double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            double R = (a*b*c)/(4*S);
            System.out.printf("%.3f\n",Math.PI * R * R);

        }
    }
}    
}
