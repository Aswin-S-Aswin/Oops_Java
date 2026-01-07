import java.util.Scanner;

public class Method18 {
    public static void main(String[] args) {
        int a = 89;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for B :");
        int b = scanner.nextInt();
        try{
            System.out.println("The Output :"+a/b);
        }
        catch (ArithmeticException A){
            System.out.println("The B is zero");
        }
        finally {
            System.out.println("Eavva setta enna ,naa erupan");
        }
    }
}
