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
            return;     //exit
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        reverse(n / 10);
    }
}
