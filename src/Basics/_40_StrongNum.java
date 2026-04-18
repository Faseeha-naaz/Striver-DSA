package Basics;

public class _40_StrongNum {
    public static void main(String[] args) {
        //Strong number = Sum of factorial of digits.
        //145 = 1! + 4! + 5! = 1+24+120 = 145


        int num = 145;
        int temp = num;
        int ans = 0;
        //find the factorial of each digit
        while(temp > 0){
            int rem = temp % 10;
            int fact = 1;
            for(int i = 1; i <= rem; i++){
                fact = fact * i;
            }

            //add that to answer and compare
            ans = ans + fact;
            temp = temp / 10;
        }
        if(num == ans){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}
