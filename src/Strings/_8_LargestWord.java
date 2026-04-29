package Strings;

public class _8_LargestWord {
    public static void main(String[] args) {
        //find the largest word in a given string -> output: coding
        //Split string into words
        //Compare lengths
        //Store longest word
        String str = "I love coding";
        String[] words = str.split(" ");  //array ["I", "love", "coding"]
        String largest = words[0];  //largest = I

        for(int i = 1; i < words.length; i++){
            if(words[i].length() > largest.length()){
                largest = words[i];
            }
        }
        System.out.println(largest);
    }
}
