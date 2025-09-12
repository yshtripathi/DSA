package arrays;

import java.util.ArrayList;
import java.util.List;

public class Leader {
    static int[] solve(int arr[]) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                }
            }
            if (leader == true) {
                l.add(arr[i]);
            }
        }
        int a[] = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 7, 2, 4};
        int[] res = solve(arr);
        System.out.println("Leaders in the array: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
