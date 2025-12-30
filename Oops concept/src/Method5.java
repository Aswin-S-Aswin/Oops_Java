class ApplForm {
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setValue(String str , int num){
        name = str;
        rollno = num;
    }
}
public class Method5{
    public static void main(String[] args) {
        ApplForm first = new ApplForm();
        first.setValue("Aswin", 17);
        first.display();
    }
}