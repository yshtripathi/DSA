//Better Approach
package arrays;

public class SecLarge2 {
    static int secLarge2(int a[]){
        int max = a[0];
        int secLarge = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        for(int i = 0; i <a.length; i++){
            if(a[i] > secLarge && a[i] < max){
                secLarge = a[i];
            }
        }
        return secLarge;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8,9,11,2,3,4,5,8};
        System.out.println("Second Largest Element in this array: " +secLarge2(arr));
    }
}
