package Basics;

public class _46_FindLargest {
    public static void main(String[] args) {
        //find largest digit in a number
        //num = 5823, largest = 8

        int num = 5823;

        int ans = 0;
        while (num > 0){
            int rem = num % 10;

            if(rem > ans){
                ans = rem;
            }
            num = num / 10;
        }
        System.out.println(ans);

    }
}
