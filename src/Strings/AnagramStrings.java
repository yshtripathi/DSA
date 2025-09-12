package Strings;

import java.util.Arrays;

public class AnagramStrings {
    static boolean solve(String s, String t){
        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
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
