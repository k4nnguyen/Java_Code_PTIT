package code.J07021;
import java.util.*;
import java.io.*;
public class J07021 {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner scanner = new Scanner(new File("DATA.in"));
        while(scanner.hasNextLine())
        {
            String res =  "";
            try{
                String s = scanner.nextLine();
                if(s.equals("END"))
                    break;
                String[] ss = s.trim().split("\\s+");
                for(int i = 0; i<ss.length; i++)
                {
                    ss[i] = ss[i].toLowerCase();
                    res = res + Character.toUpperCase(ss[i].charAt(0)) + ss[i].substring(1);
                    if(i != ss.length-1)
                        res += " ";
                }
                System.out.println(res);
            }
            catch(Exception e){

            }
        }
    }
}
