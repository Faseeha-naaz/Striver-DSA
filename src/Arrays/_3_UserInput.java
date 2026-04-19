package Arrays;

import java.util.Scanner;

public class _3_UserInput {
    public static void main(String[] args) {
        //take input from user and print an array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        System.out.print("Enter one by one: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
