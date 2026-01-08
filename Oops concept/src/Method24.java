import java.io.File;
import java.io.FileWriter;

//To write into a file
public class Method24 {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\S. ASWIN\\Documents\\Files\\Java\\Oops concept\\src\\java_hi.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("Oo epdi thana");
            fw.close();
        }
        catch (Exception E){
            System.out.println(E);
        }

    }
}
