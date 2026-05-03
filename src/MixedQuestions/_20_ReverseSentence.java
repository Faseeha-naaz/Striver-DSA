package MixedQuestions;

import java.util.Arrays;

public class _20_ReverseSentence {
    public static void main(String[] args) {
        //Reverse words in a sentence
        String str = "I love Coding";        //output: [Coding love I]
        String[] words = str.split(" ");    //[I, love, Coding]
        String rev = "";
        for(int i = words.length - 1; i >= 0; i--){
            rev = rev + words[i] +" ";   //add space
        }
        System.out.println(rev.trim());   //remove last extra space
    }
}

//StringBuilder rev = new StringBuilder();
//for(int i = words.length - 1; i >= 0; i--){
//    rev.append(words[i]).append(" ");
//}
//System.out.println(rev.toString().trim());