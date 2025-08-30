package arrays;

public class LargestElement {
    static int largestElement(int a[]){
       int largest = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > largest){
                largest = a[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,2,9,10};
        System.out.println("Largest Element in this array: " +largestElement(arr));
    }
}
