//Optimize Approach
package arrays;


public class LeftRotateByDp2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 3;
        int n = arr.length;
        leftRotateByDp2(arr, n, d); //Call the rotation function
        System.out.println("After Rotating the array by places: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void reverse(int a[], int start, int end){ //function to reverse array
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void leftRotateByDp2(int a[], int n, int d){
        n = a.length;
        reverse(a, 0, d-1 ); //Reverse first d elements
        reverse(a, d, n-1); //Reverse elements after d elements
        reverse(a, 0, n-1); //Reverse the entire array
    }
}
