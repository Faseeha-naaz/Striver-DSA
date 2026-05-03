package MixedQuestions;

import java.util.Arrays;

public class _17_FirstNonRepeating {
    public static void main(String[] args) {
        //print first non repeating character  --> aabbcde ----> output: 'c'
        String str = "aabbcde";
        char[] ch = str.toCharArray();    //[a, a, b, b, c, d, e]
        //count each chars frequency
        boolean[] b = new boolean[str.length()];
        for(int i = 0; i < ch.length; i++){
            if(b[i]){
                continue;
            }
            int count = 1;
            for(int j = i + 1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                    b[j] = true;
                }
            }
            //print the first non-repeating one, which means it has less count
            if(count == 1){
                System.out.println("First non repeating char is : "+ch[i]);
                break;
            }
        }
    }
}
