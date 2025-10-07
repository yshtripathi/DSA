package hashing;

import java.util.HashMap;
import java.util.Map;

public class NoAppears {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,4};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int freq : map.keySet()){
        }
    }
}
