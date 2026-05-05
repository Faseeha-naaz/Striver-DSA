package OOP;

public class _16_PracEncap2 {
    public static void main(String[] args) {
        //problem 4: Student record system -> encapsulation
        Student2 s = new Student2("john", 20);
        s.setMarks(60);   //output: john, 60
        s.display();
    }
}
class Student2{
    private String name;
    private int marks;
    Student2(String name, int marks){
        this.name = name;
        setMarks(marks);  //validation applied
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    int getMarks(){
        return marks;
    }
    void setMarks(int marks){
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        }
        else{
            System.out.println("Invalid marks");
        }
    }
    void display(){
        System.out.println(name+ ", " +marks);
    }
}

