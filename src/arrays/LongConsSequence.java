package arrays;

public class LongConsSequence {
    static int solve(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 1;
            boolean found = true;
            while (found == true) {
                found = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == x + 1) {
                        x = x + 1;
                        count++;
                        found = true;
                        break;
                    }
                }
            }
            if(count > longest){
                longest = count;
            }
        }
        for(int k = 0; k < longest; k++){

        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        System.out.println("Longest Consecutive sequence in array: " +solve(arr));
    }
}
