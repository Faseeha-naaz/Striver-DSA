package Basics;

public class _21_PrintAllPrime {
    public static void main(String[] args) {
        //print all prime numbers from 1 to 10

        int n = 10;

        for(int i = 2; i <= n; i++){
            boolean isPrime = true;  //outer loop to pick a number

            for(int j = 2; j * j <= i; j++){    //inner loop to divide nd check the divisibility
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
