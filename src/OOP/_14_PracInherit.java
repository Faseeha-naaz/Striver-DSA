package OOP;

public class _14_PracInherit {
    public static void main(String[] args) {
        //problem: Employee system(inheritance + method overloading)
        Employee1[] employees = {new Manager1("john", 10000), new Developer("mary", 50000)};
        for(Employee1 e : employees){
            e.displayDetails();
        }
    }
}
class Employee1{
    String name;
    double salary;

    Employee1(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println(name);
    }
}
class Manager1 extends Employee1{
    int bonus = 10000;
    Manager1(String name, double salary){
        super(name, salary);
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Total salary: " + (salary + bonus));
    }
}
class Developer extends Employee1{
    int bonus = 5000;
    Developer(String name, double salary){
        super(name, salary);
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Total salary: " + (salary + bonus));
    }
}
