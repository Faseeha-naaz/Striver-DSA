package OOP;

public class _4_Inheritance {
    public static void main(String[] args) {
        //One class can reuse properties of another
        Student s1 = new Student();
        Person p1 = new Person();
        //p1.roll_no = 102;      //---> not possible, parent doesn't know child properties
        s1.name = "Jenny";
        s1.age = 24;
        s1.roll_no = 101;
        //s1.display();     //this prints name and age
        //p1.display() won't work, it prints default values
        s1.printDisplay();   //this prints all
        //Person p = new Student();  //Object created = Student, Reference type = Person
        //p.name = "mary"; ...possible
        //p.roll_no; ...impossible, u can only use parent features but roll no belongs to child
        //System.out.println(p.name);
    }
}
class Person{
    String name;
    int age;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Student extends Person{  //inherits from parent class
    int roll_no;
    void printDisplay(){
        display();   //better design
        System.out.println("Roll: "+roll_no);
    }
}