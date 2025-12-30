import java.util.Scanner;

public class method2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = scan.nextInt();
        System.out.print("Enter a :");
        int b = scan.nextInt();
        add(a,b);

    }

    public static void add(int a , int b){
        int c = a+b;
        System.out.println("The output is "+ c);
    }
}
