package OOP;

public class _26_PracThis {
    public static void main(String[] args) {
        //problem: constructor "this" keyword
        //Calls parameterized constructor
        //this() triggers default constructor
        //Returns back to parameterized constructor
        Student3 s = new Student3("mary", 90);
        s.display();
    }
}
class Student3{
    String name;
    int age;
    Student3(){
        System.out.println("This is default constructor");
    }
    Student3(String name, int age){
        this();   //calls default constructor
        this.name = name;
        this.age = age;
        System.out.println("This is parameterised constructor");
    }
    void display(){
        System.out.println(name+", "+age);
    }
}
