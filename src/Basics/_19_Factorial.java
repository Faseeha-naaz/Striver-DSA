package Basics;

public class _19_Factorial {
    public static void main(String[] args) {
        //find the factorial of a number --> 5! = 5 * 4 * 3 * 2 * 1 = 120
        int num = 5;
        int fact = 1;   //for 0! = 1
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
