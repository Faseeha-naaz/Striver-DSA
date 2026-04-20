package Functions;

public class _6_Prime {
    public static void main(String[] args) {
        isPrime(7);
    }
    public static void isPrime(int num){
        if(num < 2){
            System.out.println("Neither prime nor composite");
            return;
        }
        boolean prime = true;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }

    }
}
