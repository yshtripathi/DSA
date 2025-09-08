package arrays;

public class MajorityElement1 {
    static int solve(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int count  = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
            if (count > (arr.length)/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,24,5};
        System.out.println("Majority element: " +solve(arr));
    }
}
