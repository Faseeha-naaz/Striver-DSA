package Strings;

public class _4_ReverseStr {
    public static void main(String[] args) {
        String str = "hello";
        String rev = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}

//common interview version -> loop from reverse
//for(int i = str.length() - 1; i >= 0; i--){
//    rev += str.charAt(i);
//}