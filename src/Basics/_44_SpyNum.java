package Basics;

public class _44_SpyNum {
    public static void main(String[] args) {
        //Sum digits = Product digits
        // num = 123 sum=6 product=6

        int num = 123;
        //check sum
        int sum = 0;
        int product = 1;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }
        if(sum == product){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }
    }
}
