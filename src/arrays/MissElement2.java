//Optimal Approach
package arrays;

public class MissElement2 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,8,9};
        System.out.println("Missing Element in the array is: " + solve(arr));
    }
    static int solve(int arr[]){
        int N = arr.length+1;
        int sum1 = (N*(N+1))/2;
        int sum2 = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum2 = sum2 + arr[i];
        }
        int miss = sum1 - sum2;
        return miss;
    }
}
