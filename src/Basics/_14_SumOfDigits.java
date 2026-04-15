package Basics;

public class _14_SumOfDigits {
    public static void main(String[] args) {
        //find sum of digits like 123 = 6
        int num = 123;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;  //3   2   1
            sum = sum + rem;   //sum = 3   5  6
            num = num / 10;   //num = 12;  1  0
        }
        System.out.println(sum);
    }
}
