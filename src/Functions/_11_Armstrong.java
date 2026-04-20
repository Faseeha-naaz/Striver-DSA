package Functions;

public class _11_Armstrong {
    public static void main(String[] args) {
        checkArmstrong(153);     //1^3 + 5^3 + 3^3 = 153
    }
    public static void checkArmstrong(int num){
        //count digits
        int temp = num;
        int count = 0;
        while (temp > 0){
            count++;
            temp = temp / 10;
        }
        //Sum armstrong
        temp = num;
        int ans = 0;
        while (temp > 0){
            int rem = temp % 10;
            //find power
            int power = 1;
            for(int i = 1; i <= count; i++){  //count = 3
                power = power * rem;  // for rem = 3 -> 3 9 27
            }
            ans = ans + power;
            temp = temp / 10;
        }
        if(num == ans){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong");
        }
    }
}
