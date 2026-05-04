package OOP;

public class _6_MultiLevelInherit {
    public static void main(String[] args) {
        //A -> B -> C
        Manager m = new Manager("jenny", 10000, "Sales");
        //m.display();
        Employee e = new Manager("mary", 2000, "IT");
        e.displaySalary();  //this displays only salary
    }
}
class Person1{
    String name;
    Person1(String name){
        this.name = name;
    }
    void displayName(){
        System.out.println("Name: "+name);
    }
}
class Employee extends Person1{
    int salary;
    Employee(String name, int salary){
        super(name);
        this.salary = salary;
    }
    void displaySalary(){
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    String department;
    Manager(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }
    void display(){
        displayName();
        displaySalary();
        System.out.println("Dept: "+department);
    }
}
