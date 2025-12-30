class ApplForm1 {
    private String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setValues(String str, int num) {
        name = str;
        rollno = num;
    }

    public String getValue() {
        return name;
    }
}

public class Method6{
    public static void main(String[] args) {
        ApplForm1 codeio = new ApplForm1();
        codeio.setValues("codeio", 71);
        codeio.display();


        System.out.println(codeio.rollno);   // allowed (default access)
        System.out.println(codeio.getValue()); // correct way for private data

        ApplForm1 viewer = new ApplForm1();
        viewer.setValues("viewer",23);
        viewer.display();
        String std = viewer.getValue();
        System.out.println(std);
//        System.out.println(codeio.name);

    }
}
