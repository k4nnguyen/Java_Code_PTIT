import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Stack<Integer> st = new Stack<>();
    for(int i = 0; i<n; i++)
    {
        int x = scanner.nextInt();
        if(st.empty())
        {
            st.push(x);
        }
        else{
            if((st.lastElement() + x) % 2 == 0)
                st.pop();
            else
                st.push(x);
        }
    }
    System.out.printf("%d",st.size());

}
    
}


