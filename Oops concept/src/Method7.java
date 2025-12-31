class Sample_Method7{
    int rollno;
    int marks;


    Sample_Method7(){
        rollno = 0;
        marks =50;
//        System.out.println(rollno);
//        System.out.println(marks);
    }
}

class Constructor{
    public static void main(String[] args) {
        Sample_Method7 obj = new Sample_Method7();
        obj.marks = 100;
        obj.rollno= 12;
        System.out.println(obj.marks);
        System.out.println(obj.rollno);
    }
}