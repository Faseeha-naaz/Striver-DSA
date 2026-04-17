package Basics;

public class _38_NArmstrong {
    public static void main(String[] args) {
        //print all Armstrong numbers from 1 to 1000

        int n = 1000;
        for(int i = 1; i <= n; i++){
            int original = i;  //to store original value
            int temp = i; //copy

            //count digits
            int count = 0;
            while(temp > 0){
                count++;
                temp = temp / 10;    //here temp changes so we again initialize temp in the next step
            }

            //armstrong sum
            temp = i;
            int ans = 0;
            while(temp > 0){
                int rem = temp % 10;
                int power = 1;
                for(int j = 1; j <= count; j++){
                    power = power * rem;
                }
                ans = ans + power;
                temp = temp / 10;
            }
            if(ans == original){
                System.out.print(original+" ");
            }
        }
    }
}
