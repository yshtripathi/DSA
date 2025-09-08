package arrays;

public class Kadane {
    static int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int sub_start = -1;
        int sub_end = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0){
                start = i;
            }
            sum += arr[i];
            if (sum > max) {
                max = sum;
                sub_start = start;
                sub_end = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Maximum sub array: ");
        for(int i = sub_start; i <= sub_end; i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-5,6,7,-1,9,-12};
        System.out.println("Maximum subarray sum: " +solve(arr));
    }
}
