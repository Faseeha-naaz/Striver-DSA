package Basics;

public class _30_CountCommonFactors {
    public static void main(String[] args) {
        // Count common factors of 12 and 18
        // Common factors = 1, 2, 3, 6
        // Count = 4

        int a = 12;
        int b = 18;
        int count = 0;

        for(int i = 1; i <= a && i <= b; i++){
            if(a % i == 0 && b % i == 0){   //if both divides -> common factor ->increment count
                count++;
            }
        }
        System.out.println(count);
    }
}
