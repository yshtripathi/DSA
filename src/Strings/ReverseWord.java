package Strings;

public class ReverseWord {
    static String solve(String s){
        int i = 0;
        String res = "";
        int n = s.length();
        while(i < n){
            while(i < n && s.charAt(i) == ' '){
                i++;
            }
            if(i >= n){
                break;
            }
            int j = i+1;
            while(j < n && s.charAt(j) != ' '){
                j++;
            }
            String sub = s.substring(i, j);
            if(res.length() == 0){
                res = sub;
            }
            else{
                res = sub+ " " +res;
            }
            i = j;
        }
        return res;
    }
    public static void main(String[] args) {
        String s  = "  The sky   is   blue    ";
        System.out.println("After Reversing word in a string: " +solve(s));
    }
}
