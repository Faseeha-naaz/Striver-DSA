package Basics;

public class _31_SimplifyFractionGCD {
    public static void main(String[] args) {
        //simplify a fraction into its lowest form
        // 18 / 24 = 3 / 4
        //so basically find gcd of both the numbers and divide them by gcd

        int a = 18;
        int b = 24;
        int x = a, y = b;
        while(y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }

        int ans1 = a / x;
        int ans2 = b / x;
        System.out.println(ans1 +" / "+ ans2);
    }
}
