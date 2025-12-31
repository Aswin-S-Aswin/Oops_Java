class Method11 {
    public static void main(String[] args) {
        New_method11 obj = new New_method11();
        obj.display();
        obj.display(6);
        obj.display(3,4);
    }
}

class New_method11{
    void display(){
        System.out.println("I am the function");
    }

    void display(int a ){
        System.out.println(a);
    }

    void display(int b,int c){
        System.out.println(b + c);
    }

}
