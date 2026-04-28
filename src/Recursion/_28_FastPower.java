package Recursion;

public class _28_FastPower {
    public static void main(String[] args) {
        //If exponent is even
        //2^10 = (2^5) * (2^5)
        //3^4  = (3^2) * (3^2)

        //If exponent is odd
        //2^5 = 2 * (2^4)

        System.out.println(power(2, 5));
    }
    public static int power(int base, int exp){
        if(exp == 0){
            return 1;
        }
        int half = power(base, exp / 2);
        if(exp % 2 == 0){
            return half * half;
        }
        else{
            return base * half * half;
        }
    }
}
