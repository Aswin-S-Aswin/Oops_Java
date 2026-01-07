import java.io.*;

class Method20 {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
