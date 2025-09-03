//Brute-Force
package arrays;

public class MissElement1 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,8,9};
        System.out.println("Missing Element in the array is: " + solve(arr));
    }

    static int solve(int arr[]) {
        int n = arr.length + 1; // total numbers should be n
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) { // ✅ check only after scanning entire array
                return i;
            }
        }
        return -1; // should not happen in valid input
    }
}
