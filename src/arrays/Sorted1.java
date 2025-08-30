//Brute Force Approach
package arrays;

public class Sorted1 {
    static String sorted1(int a[]){
        for(int i = 0; i <= a.length-1; i++){
            for(int j = i+1; j<= a.length-1; j++){
                if(a[j] > a[i]){
                    return "Array is not sorted";
                }
            }
        }
        return "Array is sorted";
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,8,9,1};
        System.out.println(sorted1(arr));
    }
}
