package arrays;

public class Count0f210 {
    static int[] solve(int arr[]){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low ++;
                mid ++;
            } else if (arr[mid] == 1) {
                mid ++;
            } else if (arr[mid] == 2) {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,1,1,1,1,1,2,0,0,0,0,0};
        int[] s = solve(arr);
        System.out.println("After sorting array is: " );
        for(int i = 0; i < s.length; i++){
            System.out.print(s[i] + " ");
        }
    }
}
