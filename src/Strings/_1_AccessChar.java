package Strings;

public class _1_AccessChar {
    public static void main(String[] args) {
        String str = "hello";
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println("First character is: "+ str.charAt(0));
    }
}
