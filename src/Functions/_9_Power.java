package Functions;

public class _9_Power {
    public static void main(String[] args) {
        System.out.println(findPower(2,3));
    }
    public static int findPower(int num, int power){
        int ans = 1;
        for(int i = 1; i <= power; i++){
            ans = ans * num;
        }
        return ans;
    }
}
