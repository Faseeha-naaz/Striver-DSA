package MixedQuestions;
import java.util.Arrays;
public class _22_RevEachWord {
    public static void main(String[] args) {
        //Reverse each word in a sentence
        String str = "I Love Coding";   //output: I evoL gnidoC

        String[] words = str.split(" ");   //split sentence into words
        String result = "";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String rev = "";

            //reverse each word
            for(int j = word.length() -1; j >= 0; j--){
                rev = rev + word.charAt(j);
            }
            result = result + rev + " ";  //join them back
        }
        System.out.println(result.trim());
    }
}
