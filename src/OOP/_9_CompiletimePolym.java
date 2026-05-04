package OOP;

public class _9_CompiletimePolym {
    public static void main(String[] args) {
        //compile-time polymorphism or method overloading
        //Same method name, Different parameters, Decided at compile time
        Printer p = new Printer();
        p.print("Hello");
        p.print(10);
        p.print("Hello", 10);
        p.print(6.6);
    }
}
class Printer{
    void print(String text){
        System.out.println(text);
    }
    void print(int number){
        System.out.println(number);
    }
    void print(String text, int number){
        System.out.println(text+ ", " +number);
    }
    void print(double number){
        System.out.println(number);
    }
}