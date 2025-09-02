package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,4,5,2,1,56};
        int num = 3;
        int res = linearSearch(arr, num);
        if(res == -1){
            System.out.println(+ num + " is not present in array");
        }
        else {
            System.out.println(+num + " is present at index: " + res);
        }
    }
    static int linearSearch(int[] a, int n){
        for(int i = 0; i < a.length; i++){
            if(a[i] == n){
                return i;
            }
        }
        return -1;
    }
}
