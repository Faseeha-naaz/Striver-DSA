package Strings;

public class _13_Rotations {
    public static void main(String[] args) {
        //check if two strings are rotations
        //"ABCD" and "CDAB" → true
        //"ABCD" and "ACBD" → false
        String s1 = "ABCD";
        String s2 = "CDAB";
        String temp = s1 + s1;
        if(s1.length() == s2.length() && temp.contains(s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
