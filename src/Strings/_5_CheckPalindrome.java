package Strings;

public class _5_CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        if(str.equals(rev)){ //.equals() is the way to compare strings, never use original == rev, it compares memory references
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
