package arrays;

public class TwoSumProblem1 {
    static boolean solve(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                int b = arr[j];
                if(arr[i] + arr[j] == target){
                    System.out.println("Element present in the array are " +a+ " and " +b);
                   return true;
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 15;
        System.out.println(solve(arr, target));

    }
}
