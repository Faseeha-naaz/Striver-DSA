package Basics;

public class _47_CountFrequency {
    public static void main(String[] args) {
        //count frequency of digits
        //num = 1223333 ----> 1 ->1, 2 -> 2 times, 3 -> 4 times

        int num = 1223333;

        for(int i = 0; i <= 9; i++){
            int temp = num;
            int count = 0;

            while(temp > 0){
                int rem = temp % 10;
                if(rem == i){
                    count++;
                }
                temp = temp / 10;
            }
            if(count > 0){
                System.out.println(i+ " -> " +count);
            }
        }
    }
}
