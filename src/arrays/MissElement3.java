package arrays;

public class MissElement3 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        System.out.println("Missing Element in array: " +solve(arr));

    }
    static int solve(int[] arr){
        int n = arr.length+1;
        int x1 = 0,x2 = 0,x3 = 0;
        for(int i = 1; i <= n; i++){
            x1 = x1^i;
        }
        for(int i = 0; i < arr.length; i++){
            x2 = x2^arr[i];
        }
        x3 = x1^x2;
        return x3;
    }
}
