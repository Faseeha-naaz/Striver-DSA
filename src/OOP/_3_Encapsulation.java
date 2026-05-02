package OOP;

public class _3_Encapsulation {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000);
        b1.deposit(1000);
        b1.withdraw(100);
        System.out.println("Total balance: "+b1.getBalance());
    }
}
class Bank{
    private int balance;
    Bank(int balance){
        this.balance = balance;
    }
    int getBalance(){
        return balance;
    }
    void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
    }
    void withdraw(int amount){
        //only if enough balance
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawn: "+amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
