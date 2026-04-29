package Arrays;
public class _37_RemoveDupli {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3};
        for(int i = 0; i < arr.length; i++){
            boolean isduplicate = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    isduplicate = true;
                    break;
                }
            }
            if(!isduplicate){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
