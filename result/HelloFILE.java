import java.util.Scanner; // Khai báo scanner
import java.io.File; // Đọc dữ liệu từ file
import java.io.FileNotFoundException; // Khai báo thư viện nếu 0 thấy file

public class helloFILE{
    public static void main(String[] args){
        try{
            // Sử dụng file tên gì, và khai báo scanner
            File file = new File("Hello.txt");
            Scanner scanner = new Scanner(file);

            // Đọc file theo từng string (theo dòng)
            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        }
        catch(FileNotFoundException e){
            // Nếu không thấy file
            System.out.print("Not Found");
        }
    }
}