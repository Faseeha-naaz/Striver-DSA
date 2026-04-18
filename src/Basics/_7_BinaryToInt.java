package Basics;

public class _7_BinaryToInt {
    public static void main(String[] args) {
        String binary = "1010";
        int result = 0;

        for(int i = 0; i < binary.length(); i++){
            char digit = binary.charAt(i);
            int num = digit - '0';   //convert char to int
            result = result * 2 + num;
        }
        System.out.println(result);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter decimal number: ");
//        int num = sc.nextInt();
//
//        long ans = 0;
//        long placeholder = 1;
//        while(num > 0){
//            int rem = num % 2;
//            ans = ans + rem * placeholder;
//            num = num / 2;
//            placeholder = placeholder * 10;
//        }
//        System.out.println(ans);
     }
}
