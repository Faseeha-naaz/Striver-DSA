package Strings;

public class _10_CountWords {
    public static void main(String[] args) {
        String str = "I   love   coding";
        int count = 0;
        String[] words = str.trim().split("\\s+");  //this handles spaces as well
        System.out.println(words.length);
    }
}
