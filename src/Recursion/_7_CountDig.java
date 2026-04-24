package Recursion;

public class _7_CountDig {
    public static void main(String[] args) {
        System.out.println(counting(12345));
    }
    public static int counting(int n){
        if(n < 10){
            return 1;
        }
        return 1 + counting(n / 10);
    }
}
