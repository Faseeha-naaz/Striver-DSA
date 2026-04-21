package Arrays;

public class _17_CountEvenDig {
    public static void main(String[] args) {
        //find numbers with even digits or even number of digits
        // nums = [12,345,6,5,7654] , output = 2, since 12, 7654 has even digits

        int[] arr = {12, 345, 6, 1, 7654};

        //step 1: count digits
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int digits = 0;
            while(num > 0){
                digits++;
                num = num / 10;
            }

            //step 2: if digits are even , increase the count
            if(digits % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
