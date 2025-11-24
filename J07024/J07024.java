import java.io.*;
import java.util.*;

public class J07024{
    public static class WordSet{
        private TreeSet<String> ts;
        public WordSet(String f) throws IOException
        {
            this.ts = new TreeSet<>();
            Scanner sc = new Scanner(new File(f));
            while(sc.hasNext()) this.ts.add(sc.next().toLowerCase());
        }
        public WordSet(TreeSet<String> x)
        {
            this.ts = x;
        }
        public WordSet difference(WordSet a)
        {
            TreeSet<String> x = new TreeSet<>();
            x.addAll(this.ts);
            for(String tmp:a.ts)
            {
                x.remove(tmp);
            }
            return new WordSet(x);
        }
        @Override
        public String toString(){
            String s = "";
            for(String x:this.ts)
            {
                s += (x + " ");
            }
            return s;
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}