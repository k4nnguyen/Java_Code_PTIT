import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> str = (ArrayList<String>) ois.readObject();
        ois.close();
        Set<String> se = new TreeSet<>();
        
        for(String x:str)
        {
            String[] wrds = x.trim().toLowerCase().split("\\s+");
            se.addAll(Arrays.asList(wrds));
        }

        Scanner scanner = new Scanner(new File("VANBAN.in"));
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().toLowerCase();
            String[] words = s.trim().split("\\s+");
            for (String w : words) {
                if (se.contains(w)) {
                    System.out.println(w);
                    se.remove(w);
                }
            }
        }
        scanner.close();
    }    
}
