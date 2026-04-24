package Recursion;

public class _6_Power {
    public static void main(String[] args) {
        System.out.println(power(2, 5)); //32
    }
    public static int power(int base, int exp){
        if(exp == 0){
            return 1;
        }
        return base * power(base,exp - 1);
    }
}
