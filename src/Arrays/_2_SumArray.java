package Arrays;

import java.util.Scanner;

public class _2_SumArray {
    public static void main(String[] args) {
        //find sum of array elements
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

        //take input and find sum


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter elements: ");
//
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Elements are: ");
//        int sum = 0;
//        for(int i = 0; i < n; i++){
//            System.out.print(arr[i]+" ");
//            sum = sum + arr[i];
//        }
//        System.out.println();
//        System.out.print("Sum is: "+sum);
//

    }
}
