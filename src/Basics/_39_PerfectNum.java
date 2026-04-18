package Basics;

public class _39_PerfectNum {
    public static void main(String[] args) {
        //check if a number is perfect number
        //Perfect number = A number whose proper factors sum to itself.
        //Eg: 6 = 1+2+3 = 6 ----> perfect number......28 = 1+2+4+7+14 = 28 ---> a perfect number.....
        // 7 = 1 ----> not a perfect number
        int num = 6;
        int sum = 0;
        //finding factors
        for(int i = 1; i < num; i++){   //u can also check till n/2, because no factor except itself is greater than half
            int rem = num % i;   //for factors
            if(rem == 0) {
                sum = sum + i;
            }
        }
       // System.out.println(sum);
        if(sum == num){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
