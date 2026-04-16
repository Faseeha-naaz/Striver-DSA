package Basics;

public class _33_LCM {
    public static void main(String[] args) {
        //LCM = least common multiple, Smallest positive number divisible by both numbers
        //it will never be less than the maximum number
        //find lcm of 2 numbers -> lcm(12, 18) = 36

//        int a = 12;
//        int b = 18;
//        int max = Math.max(a, b);
//
//        while(true){
//            if(max % a == 0 && max % b == 0){
//                System.out.println(max);
//                break;
//            }
//            max++;
//        }

        //the above is the brute force method which is inefficient for larger numbers, so use gcd method
        // LCM = a * b / gcd(a, b)

        int a = 12;
        int b = 18;
        int x = a, y = b;

        while(y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        int lcm = (a * b) / x;
        System.out.println(lcm);
    }
}
