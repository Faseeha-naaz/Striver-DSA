package Recursion;

public class _10_Palindrome {
    static int rev = 0;
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        reverse(n);
        System.out.println(original == rev);
    }
    public static void reverse(int n){
        if(n == 0){
            return;
        }
        rev = rev * 10 + (n % 10);
        reverse(n / 10);
    }
}
