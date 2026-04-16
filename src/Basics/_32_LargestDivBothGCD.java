package Basics;

public class _32_LargestDivBothGCD {
    public static void main(String[] args) {
        //find the largest number dividing both after subtraction
        //Given two numbers a and b, subtract the smaller from the larger once,
        //then find the largest number that divides both resulting numbers.

        // a= 20, b = 12 -> 20 - 12 = 8 -> largest number dividing both 12 and 8 = 4
        //first a - b, then gcd(b, result) -> gcd(12, 8) = 4

        int a = 20;
        int b = 12;
        int temp = a - b;

        int x = b;
        int y = temp;


        while(y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        System.out.println(x);
    }
}
