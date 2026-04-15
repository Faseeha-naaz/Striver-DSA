package Basics;

public class _17_CountDig {
    public static void main(String[] args) {
        //count digits in a number
        int num = 102220;
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
