package Recursion;

public class _8_ProductDig {
    public static void main(String[] args) {
        System.out.println(product(1234));  //24
    }
    public static int product(int n){
        if(n < 10){
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
