package Basics;

public class _6_IntToBinary {
    public static void main(String[] args) {
//        int num = 9;
//        String binary = Integer.toBinaryString(num);
//        System.out.println(binary);

        //manual method -> divide by 2 until u reach 0 nd store the reminder
        int num = 10;
        String binary = " ";
        while(num > 0){
            int rem = num % 2;
            binary = rem + binary;
            num = num / 2;
        }
        System.out.println(binary);
    }
}
