package OOP;

public class _1_Basic {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.name = "john";
        s1.age = 35;   //s1 points to one object

        s2.name = "mary";   //s2 pointer to the other
        s2.age = 30;

        s1 = s2;
        s1.name = "walter";   //now s1 nd s2 points to the same object, both names become walter only along with age

        System.out.println("Student 1: ");
        System.out.println("Name: " +s1.name);
        System.out.println("Age: " +s1.age);
        System.out.println("Student 2: ");
        System.out.println("Name: "+s2.name);
        System.out.println("Age: "+s2.age);

    }
}
class Student1{
    String name;
    int age;
}