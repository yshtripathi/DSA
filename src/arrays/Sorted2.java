//Better Approach
package arrays;

public class Sorted2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,8,9,1};
        System.out.println(sorted2(arr));
    }

    private static boolean sorted2(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
