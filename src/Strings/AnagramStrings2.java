package Strings;

public class AnagramStrings2 {
    static boolean solve(String s, String t){
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            arr[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s  = "Silent";
        String t = "Listen";
        System.out.println("Strings are anagrams: " +solve(s, t));
    }
}
