package OOP;

public class _27_PractSuper {
    public static void main(String[] args) {
        //problem: Practice "super" keyword
        //this()	calls another constructor in same class
        //super()	calls parent class constructor
        Employee2 e = new Employee2("marvel", 3000);
        e.display();
    }
}
class Person2{
    String name;
    Person2(String name){
        this.name = name;
    }
}
class Employee2 extends Person2{
    int salary;
    Employee2(String name, int salary){
        super(name);     //This calls the parent constructor and initializes inherited data properly.
        this.salary = salary;
    }
    void display(){
        System.out.println(name+", "+salary);
    }
}
