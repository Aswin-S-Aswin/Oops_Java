//Encapsulation

class Student{
    private String name;   // data hiding
    private int rollno;

    public void setValues(String n, int r) {   // setter
        name = n;
        rollno = r;
    }

    public String getName() {   // getter
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}

public class Method9{
    public static void main(String[] args) {
        Student s = new Student();
        s.setValues("Aswin", 17);

        System.out.println(s.getName());
        System.out.println(s.getRollno());
    }
}
