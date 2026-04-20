package Functions;

public class _10_Palindrome {
    public static void main(String[] args) {
        isPalindrome(121);
    }
    public static void isPalindrome(int num){
        int rev = 0;
        int original = num;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(original == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
