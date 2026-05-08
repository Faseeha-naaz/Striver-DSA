package OOP;

public class _30_MiniProject {
    public static void main(String[] args) {
        //Library Management System
        //Encapsulation, Constructors, Static, Interfaces, Polymorphism, Object interaction
        Book b1 = new Book("Atomic habits", "James");
        Book b2 = new Book("Five point someone", "Chetan Bhagat");
        System.out.println("Book 1: ");
        b1.issueBook();
        b1.returnBook();
        b1.display();
        System.out.println("Book 2: ");
        b2.issueBook();
        b2.returnBook();
        b2.display();
        Book.showTotalBooks();
    }
}
class Book{
    private String title;
    private String author;
    private boolean isIssued;
    static int totalBooks;

    Book(String title, String author){
        this.title =  title;
        this.author = author;
        isIssued = false;
        totalBooks++;
    }
    void issueBook(){
        if(isIssued){
            System.out.println("Book already issued previously");
        }
        else{
            System.out.println("Book issued successfully");
            isIssued = true;

        }
    }
    void returnBook(){
        if(!isIssued){
            System.out.println("Book was not issued to return");
        }
        else{
            System.out.println("Book returned successfully");
            isIssued = false;
        }
    }
    void display(){
        System.out.println("Title: "+ title+", Author: "+author +", issued status: "+isIssued);
    }
    static void showTotalBooks(){
        System.out.println("Total books: "+totalBooks);
    }
}
