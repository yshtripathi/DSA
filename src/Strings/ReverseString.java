package Strings;

public class ReverseString {
    static String solve(String s){
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Without reverse: " +s);
        System.out.println("After Reverse: " +solve(s));

    }
}
