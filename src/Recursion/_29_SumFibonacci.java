package Recursion;

public class _29_SumFibonacci {
    public static void main(String[] args) {
        //fibSum(5)
        //= 0 + 1 + 1 + 2 + 3 + 5
        //= 12
        System.out.println(fib(5));
        System.out.println(fibSum(5));
    }
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static int fibSum(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n) + fibSum(n - 1);
    }
}

//fib(5) + fibSum(4)
//5      + fibSum(4)
//Then:
//5 + 3 + 2 + 1 + 1 + 0
//= 12
