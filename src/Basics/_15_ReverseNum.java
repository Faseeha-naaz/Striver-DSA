package Basics;

public class _15_ReverseNum {
    public static void main(String[] args) {
        //reverse a number
        int num = 123;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;    //3  2   1
            rev = rev * 10 + rem;  //3  32  321
            num = num / 10;        //12 1   0
        }
        System.out.println(rev);
    }
}
