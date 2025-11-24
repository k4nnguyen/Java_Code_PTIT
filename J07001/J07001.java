import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class J07001 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        while(scanner.hasNextLine())
        {
            String s = scanner.nextLine();
            System.out.println(s);
        }
        scanner.close();
    }
}

