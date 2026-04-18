package Basics;

public class _41_AutomorphicNum {
    public static void main(String[] args) {
        //A number is Automorphic if its square ends with the same digits as the number itself.
        //num = 5, 5^2 = 25 is automorphic since the last digit ends with 5
        //num = 25, 25^2 = 625 is automorphic since the last digits ends with 25
        //num = 7, 7^2 = 49 ...not an automorphic
        //if num = 25 then %100, if num = 5 then %10
        int num = 25;
        int temp = num;

        //find squares
        int sq = temp * temp;
        System.out.println("Square is: "+sq);
        //count digits
        int count = 0;
        if(num == 0){
            count = 1;
        }
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        System.out.println("Count of number is: "+count);

        //divisor = 10^count
        int div = 1;
        for(int i = 1; i <= count; i++){
            div = div * 10;
        }
        System.out.println("divisor: "+div);

        //check last 2 digits nd compare
        int rem = sq % div;
        System.out.println("Matching last digits: "+rem);
        if (num == rem){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not an automorphic");
        }
    }
}
