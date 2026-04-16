package Basics;

public class _36_ArmstrongN {
    public static void main(String[] args) {
        //check armstrong number or not----> (1³ + 5³ + 3³ = 153)
        int n = 153;
        int original = n;

        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if(sum == original){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
