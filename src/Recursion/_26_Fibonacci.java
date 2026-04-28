package Recursion;

public class _26_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    public static int fib(int n){
        //0,1,1,2,3,5,8,13...
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
