package OOP;

public class _8_RuntimePolym {
    public static void main(String[] args) {
        //Run-time polymorphism or method overriding
        //same method behaves differently
        Animal a = new Dog();     //Object type decides which method runs
        Animal c = new Cat();
        a.sound();
        c.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
