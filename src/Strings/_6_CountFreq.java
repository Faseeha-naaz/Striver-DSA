package Strings;

public class _6_CountFreq {
    public static void main(String[] args) {
        //count frequency of a character 'a' -> output: 3
        String str = "BAnana";
        char target = 'a';
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
