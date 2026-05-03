package MixedQuestions;

public class _18_LastNonRepeating {
    public static void main(String[] args) {
        String str = "aabbcde";
        char[] ch = str.toCharArray();
       //go from right to left
        for(int i = ch.length - 1; i >= 0; i--){
            int count = 0;
            for(int j = 0; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("Last non-repeating character is: " +ch[i]);
                break;
            }
        }

    }
}
