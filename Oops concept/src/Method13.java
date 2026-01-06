abstract class Computer {
    void turnOn(){
        System.out.println("Turning On");
    }
}

class HP extends Computer{

}

class Dell extends Computer{

}

class Method13 {
    public static void main(String[] args) {
        HP hp = new HP();
        hp.turnOn();

        Dell dell = new Dell();
        dell.turnOn();
    }

}