package Strings;

public class _14_CommonChar {
    public static void main(String[] args) {
        //find common characters between two strings
        String s1 = "aabcd";
        String s2 = "baadf";   //output:a b d
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            //check if present in s2
            if(s2.contains(String.valueOf(ch))){
                //avoid duplicates
                //a → index 0
                //a → index 1
                //b → index 2
                //c → index 3
                //d → index 4
                if(s1.indexOf(ch) == i){
                    System.out.print(ch+" ");
                }
            }
        }
    }
}
