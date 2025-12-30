class AppForm{
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        AppForm first = new AppForm();
        first.name = "Aswin";
        first.rollno = 17;
        first.display();

    }
}