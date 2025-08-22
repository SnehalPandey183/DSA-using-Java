package demo1.java;
class student{
    String name;
    int rno;
    double percentage;
}
public class demo11 {
    public static void main(String[] args) {
        student obj = new student();
        obj.name = "snehal";
        obj.rno = 12;
        obj.percentage = 96.8;
        System.out.print("name is" + " " +obj.name + " " +"and the roll no is" +" "+ obj.rno + " "+ "and percentage is" +" "+ obj.percentage);

    }
}
