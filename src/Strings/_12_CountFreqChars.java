package Strings;

public class _12_CountFreqChars {
    public static void main(String[] args) {
        String str = "listen";
        char[] ch = str.toCharArray();
        boolean[] b = new boolean[str.length()];
        for(int i = 0; i < ch.length; i++){
            if(b[i]){
                continue; //skip already counted elements
            }
            int count = 1;
            for(int j = i + 1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                    b[j] = true;   //mark character as counted
                }
            }
            System.out.println(ch[i]+" : " +count);
        }
    }
}
