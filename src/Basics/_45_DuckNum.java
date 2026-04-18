package Basics;

public class _45_DuckNum {
    public static void main(String[] args) {
        //Contains 0, but not at first digit.
        //1023 ✅
        //1200 ✅
        //0123 ❌

        int num = 1023;
        boolean isDuck = false;
        while (num > 0){
            int rem = num % 10;
            if(rem == 0){
                isDuck = true;
                break;
            }
            num = num / 10;
        }
        if(isDuck){
            System.out.println("Duck");
        }
        else{
            System.out.println("Not");
        }


        //if u want to check for numbers starting with "0", this is the best way
//        String n = "023";
//
//        if(n.contains("0") && n.charAt(0) != '0'){
//            System.out.println("Duck Number");
//        }else{
//            System.out.println("Not a duck number");
//        }
    }
}
