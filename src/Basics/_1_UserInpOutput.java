package Basics;
import java.util.Scanner;
public class _1_UserInpOutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number which you would like to print: ");
        int num = sc.nextInt();
        System.out.println(num);
    }
}
