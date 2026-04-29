package Strings;

public class _11_RemoveDupli {
    public static void main(String[] args) {
        //remove duplicate characters
        String str = "programming";
        String result = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                //It checks the position of a character or string. If character not already there, add it.
                //If found → returns index number
                //If not found → returns -1
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
