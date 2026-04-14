package Basics;

public class _8_AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";     //ans = 10101
        String result = "";
        int carry = 0;

        int i = a.length()- 1;     //right -> left
        int j = b.length()- 1;

        while(i >= 0 || j >= 0 || carry > 0){
            int num1 = 0;
            int num2 = 0;

            if(i >= 0){
                num1 = a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                num2 = b.charAt(j) - '0';
                j--;
            }

            int sum = num1 + num2 + carry;

            int digit = sum % 2;
            carry = sum / 2;

            result = digit + result;  //to add at front   left -> right
        }
        System.out.println(result);
    }
}
