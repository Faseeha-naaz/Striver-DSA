package Strings;

public class _2_CountVowels {
    public static void main(String[] args) {
        //vowels -> a,e,i,o,u -> output: 2
        String str = "hELLO";
        int count = 0;
        str = str.toLowerCase();  //works for uppercase as well
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
