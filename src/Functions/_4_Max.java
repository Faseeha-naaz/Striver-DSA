package Functions;

public class _4_Max {
    public static void main(String[] args) {
        System.out.println(maximum(10, 25));
    }
    public static int maximum(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
}
