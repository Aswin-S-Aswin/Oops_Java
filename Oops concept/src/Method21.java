import java.util.Scanner;

public class Method21 {
    public static void main(String[] args) {
        /*
        toString
        toBinaryString
        valueOf
        parseInt
         */
        String s = Integer.toString(55);
        System.out.println(s);

        String x = Integer.toBinaryString(15);
        System.out.println(x);

        Integer y = Integer.valueOf(x);
        System.out.println(y);

        int z = Integer.parseInt(s);
        System.out.println(z);

        String hex = Integer.toHexString(15);
        System.out.println(hex);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to convert into HexaDecimal : ");
        int ip = scan.nextInt();
        new Hexa(ip);
    }
}

class Hexa{


    public Hexa(int get){
        for (int con=1;con<=get;con++){
            System.out.println(Integer.toHexString(con).toUpperCase());

        }
    }
}