package arrays;

public class NoAppearOnce {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3};
        System.out.println("Number that appears once in array: " +solve(arr));
    }
    static int solve(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j]  == num){
                   count++;
                }
            }
            if(count == 1){
                return num;
            }
        }
        return -1;
    }
}
