package Strings;

public class _7_RemoveSpaces {
    public static void main(String[] args) {
        //remove spaces and print helloworld
        String str = "hello world";
        str = str.replace(" ", "");   //replace() creates a modified copy, you must store is str = ...
        System.out.println(str);
    }

}
