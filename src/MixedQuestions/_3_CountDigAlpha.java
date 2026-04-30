package MixedQuestions;

public class _3_CountDigAlpha {
    public static void main(String[] args) {
        //count digits + alphabet
        String str = "abc1223";
        int countD = 0;
        int countA = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){   //you can also use .isLetter(ch) or .isDigit(ch)
                countA++;
            }
            else if(ch >= '0' && ch <= '9'){
                countD++;
            }
        }
        System.out.println("Alphabets: " + countA);
        System.out.println("Digits: " + countD);
    }
}
//if(Character.isLetter(ch)){
//    countA++;
//}
//else if(Character.isDigit(ch)){
//    countD++;
//}