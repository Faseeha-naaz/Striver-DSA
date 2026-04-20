package Functions;

public class _3_EvenOdd {
    public static void main(String[] args) {
        System.out.println(check(12));
    }
    public static boolean check(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
