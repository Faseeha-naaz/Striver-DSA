package Recursion;

public class _5_SumDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
    public static int sum(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}
//sum(12345)
//5 + sum(1234)
//5 + 4 + sum(123)
//5 + 4 + 3 + sum(12)
//5 + 4 + 3 + 2 + sum(1)
//15