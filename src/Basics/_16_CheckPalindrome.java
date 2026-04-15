package Basics;

public class _16_CheckPalindrome {
    public static void main(String[] args) {
        //check if a number is palindrome
        int num = 121;
        int original = num;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(original == rev){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
