package Basics;

public class _27_GCD {
    public static void main(String[] args) {
        //find the gcd (hcf) of 2 numbers ... lcm of 12, 18 = 6
        //find factors of 12, then factors of 18, then find common factors of both and return the highest of all
//        int num1 = 12;
//        int num2 = 18;
//        int gcd = 1;
//        //using factor method
//        for(int i = 1; i <= num1 && i <= num2; i++){
//            if(num1 % i == 0 && num2 % i == 0){
//                gcd = i;
//            }
//        }
//        System.out.println(gcd);
//
//          the above method only works for small numbers, use Euclidean method to solve gcd (better way)
        int num1 = 12;
        int num2 = 18;


        while(num2 != 0){
            int rem = num1 % num2;   // '%' shrinks the problem  -> gcd(a, b) = gcd(b, a % b)
            num1 = num2;
            num2 = rem;
        }
        System.out.println(num1);
    }
}
