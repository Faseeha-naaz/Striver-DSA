package Basics;

public class _20_Prime {
    public static void main(String[] args) {
        //check if a number is prime or not  ->2,3,5,7,11,13,17..
        int num = 7;
        //a number is prime if it is divisible by 1 and itself
        boolean isPrime = true;
        if(num < 2){   //neither prime not composite
            isPrime = false;
        }
        else{
            for(int i = 2; i * i <= num; i++){    //for better optimization i * i
                if(num % i == 0){   //it is not a prime number if it is divisible or gives reminder 0 so make it false
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
