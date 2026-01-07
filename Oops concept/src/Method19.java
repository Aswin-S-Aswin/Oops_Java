import java.util.Scanner;

public class Method19 {
    static void checkAge(int age){
        if (age<28){
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Your are Eligible");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        checkAge(age);
    }
}