//Exception Handling
class Method17{
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException A){
            System.out.println("B is zero");
        }
    }
}