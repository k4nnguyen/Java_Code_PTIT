import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class J02012 {
    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayList<Integer> a = new ArrayList<>();
    for(int i = 0; i<n; i++)
    {
        int x = scanner.nextInt();
        a.add(x);
        Collections.sort(a);

        System.out.printf("Buoc %d: ",i);
        a.forEach(k -> System.out.printf("%d ",k));
        System.out.println("");
            
    }
    

}
    
}


