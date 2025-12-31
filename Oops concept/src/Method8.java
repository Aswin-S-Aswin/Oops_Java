class Sample_Method8{
    int rollno;
    int marks;


    Sample_Method8(int num,int mark){
        rollno = num;
        marks = mark;
//        System.out.println(rollno);
//        System.out.println(marks);
    }
}

class Constructor8{
    public static void main(String[] args) {
        Sample_Method8 obj = new Sample_Method8(100,12);
//        obj.marks = 190;
//        obj.rollno= 1;
        Sample_Method8 obj2 = new Sample_Method8(21,23);
        System.out.println("marks"+obj2.marks);
        System.out.println("Marks"+obj.marks);
        System.out.println("rollno"+obj.rollno);
    }
} 