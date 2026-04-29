package Strings;

public class _3_Consonants {
    public static void main(String[] args) {
        //count consonants -> other than vowels (a,e,i,o,u) -> output: 3
        //Count consonants only if:
        //character is a letter  ->.isLetter()
        //character is not a vowel
        String str = "Hello";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(Character.isLetter(ch) && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
