package OOP;

public class _18_PracOverride {
    public static void main(String[] args) {
        //problem: Animal system -> method overriding
        Animal1[] animals = {new Dog1(), new Cat1()};
        for(Animal1 a: animals){
            a.makeSound();
        }
    }
}
class Animal1{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog1 extends Animal1{
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat1 extends Animal1{
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
