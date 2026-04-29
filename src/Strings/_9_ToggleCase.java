package Strings;

public class _9_ToggleCase {
    public static void main(String[] args) {
        //Toggle case means:
        //lowercase → uppercase
        //uppercase → lowercase
        String str = "aBc";  //-> AbC
        String res = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                res = res + Character.toUpperCase(ch);
            }
            if(Character.isUpperCase(ch)){
                res = res + Character.toLowerCase(ch);
            }
        }
        System.out.println(res);
    }
}
