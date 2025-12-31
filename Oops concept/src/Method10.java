//Inheritance

class Method10 {
    int nolegs = 4;
    public static void eat(){
        System.out.println("what ever");
    }
    public static void walk() {
        System.out.println("Where ever");
    }
}

class dog extends Method10{
    Boolean bark = true;
}

class method10_main{
    public static void main(String[] args) {
        dog obj = new dog();
        System.out.println(obj.nolegs);
        System.out.println(obj.bark);
        obj.eat();
        obj.walk();
    }
}