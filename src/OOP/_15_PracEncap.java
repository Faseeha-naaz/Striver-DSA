package OOP;

public class _15_PracEncap {
    public static void main(String[] args) {
        //problem 3: Bank account system -> encapsulation
        BankAccount b = new BankAccount(1800);
        b.deposit(200);
        b.withdraw(800);
        System.out.println("Final balance: "+b.getBalance());
    }
}
class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid deposit amount");
        }
        else{
            balance = balance + amount;
            System.out.println("Deposited: "+amount);
        }
    }
    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        }
        else if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdrawn: "+amount);
        }
    }
}
