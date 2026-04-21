package Basics;

public class _48_SecondLargest {
    public static void main(String[] args) {
        //find second largest number
        int a = 4, b = 7, c = 2, d = 9, e = 5;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int x;

        x = a;
        if(x > max1){
            max2 = max1;
            max1 = x;
        } else if(x > max2 && x != max1){
            max2 = x;
        }

        x = b;
        if(x > max1){
            max2 = max1;
            max1 = x;
        } else if(x > max2 && x != max1){
            max2 = x;
        }

        x = c;
        if(x > max1){
            max2 = max1;
            max1 = x;
        } else if(x > max2 && x != max1){
            max2 = x;
        }

        x = d;
        if(x > max1){
            max2 = max1;
            max1 = x;
        } else if(x > max2 && x != max1){
            max2 = x;
        }

        x = e;
        if(x > max1){
            max2 = max1;
            max1 = x;
        } else if(x > max2 && x != max1){
            max2 = x;
        }

        System.out.println("Second max = " + max2);

    }
}
