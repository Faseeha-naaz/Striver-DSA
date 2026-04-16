package Basics;

public class _29_GCD3Nums {
    public static void main(String[] args) {
        //find the GCD of 3 numbers -> gcd(a, b, c) = gcd(gcd(a, b),c)

        int a = 12;
        int b = 18;
        int c = 24;
        int x = a, y = b, z = c;

//      first find gcd(a, b)

        while(y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        System.out.println("GCD of a, b = " +x);
        //then find gcd(gcd(a, b), c)

        while(z != 0){
            int rem = x % z;
            x = z;
            z = rem;
        }
        System.out.println("GCD of 3 numbers is: "+x);
    }
}
