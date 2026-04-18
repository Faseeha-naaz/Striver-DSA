package Basics;

public class _43_HarshadNum {
    public static void main(String[] args) {
        //A number divisible by sum of digits.
        // num = 18.... so 18 / (1+8) = 2

        int num = 18;
        int original = num;
        //find sum of digits
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum is: "+sum);

        //check divisibility
        if(original % sum == 0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("Not a Harshad number");
        }
    }
}
