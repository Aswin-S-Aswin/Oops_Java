class Father15{
    static char gender = 'M';
    static int age = 50;
    static void print(){
        System.out.println("Code io | Parent Class");
    }
}


class Daugther15 extends Father15{
    char gender = 'F';
}

class Inheritance15{
    public static void main(String[] args) {
        Father15 F = new Father15();
        System.out.println(F.age);

        Daugther15 M = new Daugther15();
        M.age = 18;

        Father15.print();
        System.out.println("Age of Father after changing static "+F.age);
        System.out.println("Age of a mom "+M.age);
    }
}
