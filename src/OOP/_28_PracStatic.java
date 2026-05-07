package OOP;

public class _28_PracStatic {
    public static void main(String[] args) {
        //problem: practice "static" keyword
        Employee3 e1 = new Employee3("john", 10);
        Employee3 e2 = new Employee3("mary", 20);
        e1.display();
        e2.display();
    }
}
class Employee3{
    String name;
    int id;
    static String company = "Google";   //Only one copy shared across all objects.
    Employee3(String name, int id){
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println(name+", "+id+", "+Employee3.company);
    }
}
