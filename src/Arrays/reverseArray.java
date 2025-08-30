package Arrays;
import java.util.Arrays;
public class reverseArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            System.out.println("Original Array: " + Arrays.toString(arr));

            // Reverse the array
            reverse(arr);

            System.out.println("Reversed Array: " + Arrays.toString(arr));
        }

        // Method to reverse array in-place
        public static void reverse(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                // Swap elements
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
    }
