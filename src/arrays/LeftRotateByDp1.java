//Brute Force
package arrays;

public class LeftRotateByDp1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 3;
        leftRotateByDp1(arr, d);
    }
    static void leftRotateByDp1(int a[], int d){
        int n = a.length;
        d = d%n;
        int temp[] = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = a[i];
        }
        for(int i = d; i < n; i++){
            a[i-d] = a[i];
        }
        int j = 0;
        for(int i = n-d; i < n; i++){
            a[i] = temp[j];
            j++;
        }
        System.out.println("After rotating the array by %d places: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
