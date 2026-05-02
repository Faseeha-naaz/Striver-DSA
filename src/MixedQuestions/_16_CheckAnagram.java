package MixedQuestions;

import java.util.Arrays;

public class _16_CheckAnagram {
    public static void main(String[] args) {
        //Two strings are anagrams if: they have same characters with same frequency
        //Convert to char array
        //Sort both
        //Compare          .........this is a sorting method : O(n log n)
        String s1 = "listen";
        String s2 = "silent";
        if(check(s1, s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an anagram");
        }
    }
    public static boolean check(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
