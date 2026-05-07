package OOP;

public class _29_PracStatCons {
    public static void main(String[] args) {
        //problem: student counting system
        Student4 s1 = new Student4("johnny", 1);
        Student4 s2 = new Student4("larva", 2);
        s1.display();
        s2.display();
        Student4.showCount();  //test like this
    }
}
class Student4{
    String name;
    int id;
    static int count = 0;
    Student4(String name, int id){
        this.name = name;
        this.id = id;
        count++;
    }
    void display(){
        System.out.println(name+","+id);
    }
    static void showCount(){
        System.out.println("Total students: "+count);
    }
}