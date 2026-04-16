package Basics;

import java.util.Scanner;

public class _37_ArmstrongUserInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
        int num = sc.nextInt();
        int original = num;

        //count digits
        int temp = num;
        int count = 0;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        System.out.println("No of digits are: "+count);

        //Armstrong sum
        temp = num;
        int ans = 0;
        while(temp > 0){
            int rem = temp % 10;

            //find power
            int power = 1;
            for(int i = 1; i <= count; i++){
                power = power * rem;    //this calculates 3^3 then 5 ^3 then 1^3..nd while loop runs thrice for this
            }
            ans = ans + power;   //ans = 27 first, then 27 + 125 = 152, then 152 + 1 = 153
            temp = temp / 10;
        }
        if(ans == original){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }

    }
}
