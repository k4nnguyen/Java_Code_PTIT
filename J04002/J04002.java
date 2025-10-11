import java.util.*;
class Rectangle{
    private Double width,height;
    private String color;
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
        this.color = "";
    }
    public Rectangle(Double w, Double h, String c)
    {
        this.width = w;
        this.height = h;
        this.color = c.toLowerCase();
        this.color = "" + Character.toUpperCase(color.charAt(0)) + color.substring(1);
    }
    public Double getWidth()
    {
        return width;
    }
    public void setWidth(Double width)
    {
        this.width = width; 
    }
    public Double getHeight()
    {
        return height;
    }
    public void setHeight(Double width)
    {
        this.height = height; 
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String Color)
    {
        this.color = color; 
    }
    public Double findArea()
    {
        return width*height;
    }
    public Double findPerimeter()
    {
        return (width+height)*2;
    }
}
public class J04002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rg = new Rectangle(scanner.nextDouble(), scanner.nextDouble(), scanner.next());
        if(rg.getWidth() <= 0 || rg.getHeight() <= 0)
            System.out.println("INVALID");
        else
            System.out.printf("%.0f %.0f %s",rg.findPerimeter(),rg.findArea(),rg.getColor());
    }
}
