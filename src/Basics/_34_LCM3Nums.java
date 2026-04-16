package Basics;

public class _34_LCM3Nums {
    public static void main(String[] args) {
        //find the lcm of 3 numbers
        //lcm(4,6,8) = 24   ------>      lcm(lcm(4,6), 8)

        int a = 4;
        int b = 6;
        int c = 8;
        int x =a, y = b;
        while(y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        int lcm1 = a * b / x;   //12

        //find gcd(lcm1, c)   ------> gcd(12, 8)
        int p = lcm1, q = c;
        while(q != 0){
            int rem = p % q;
            p = q;
            q = rem;
        }
        int lcm2 = lcm1 * c / p;
        System.out.println(lcm2);
    }
}
