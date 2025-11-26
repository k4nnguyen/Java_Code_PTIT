import java.io.File;
import java.io.IOException;
import java.util.*;
public class J07014 {
    public static class WordSet{
        private TreeSet<String> ts;
        public WordSet(String f) throws IOException{
            this.ts = new TreeSet<>();
            Scanner sc = new Scanner(new File(f));
            while(sc.hasNext())
                this.ts.add(sc.next().toLowerCase());
        }
        public WordSet(TreeSet<String> x)
        {
            this.ts = x;
        }
        public WordSet union(WordSet a)
        {
            TreeSet<String> tmp = new TreeSet<>();
            tmp.addAll(this.ts);
            tmp.addAll(a.ts);
            return new WordSet(tmp);
        }
        public WordSet intersection(WordSet a)
        {
            TreeSet<String> tmp1 = new TreeSet<>();
            TreeSet<String> tmp2 = new TreeSet<>();
            tmp1.addAll(this.ts);
            for(String x:a.ts)
            {
                if(tmp1.contains(x))
                    tmp2.add(x);
            }
            return new WordSet(tmp2);
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
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
