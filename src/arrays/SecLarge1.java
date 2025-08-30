//Brute Force Approach
package arrays;

public class SecLarge1 {
    static int secLarge1(int a[]){
        for(int i = 0; i < a.length; i++){ //bubble sort algorithm
            for(int j = 0; j < a.length-1-i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        //Arrays.sort(a); //built-in method
        int max = a[a.length-1]; //a[a.length-1] gives value of last index
        int secLarge = Integer.MIN_VALUE;
        for(int i = a.length-1; i >= 0; i--){
            if(a[i] != max){
                secLarge = a[i];
                break;
            }
        }
        return secLarge;
    }
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,7,7,9,8};
        System.out.println("Second Largest Element in this array: " +secLarge1(arr));
    }
}
