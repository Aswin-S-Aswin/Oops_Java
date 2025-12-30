//Using recursive function

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        natNum(a);
    }



    public static void natNum(int a){
        if (a == 1){//Base Case
            System.out.print(a+" ");
        }else {//Recursive Case
            System.out.print(a+" ");
            natNum(a-1);
        }
    }
}
