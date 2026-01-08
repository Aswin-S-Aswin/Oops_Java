import java.io.File;
import java.util.Scanner;

public class Method23 {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\S. ASWIN\\Documents\\Files\\Java\\Oops concept\\src\\java_hi.txt");
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
