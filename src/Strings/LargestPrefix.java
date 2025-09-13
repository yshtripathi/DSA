package Strings;

public class LargestPrefix {
    static String solve(String[] s){
        int minLen = s[0].length();
        for(String str: s){
            if(str.length() < minLen){
                minLen = str.length();
            }
        }
        String str  = "";
        for(int i = 0; i < minLen; i++){
            char ch = s[0].charAt(i);
            for(int j = 1; j < s.length; j++){
                if(s[j].charAt(i) != ch){
                    return str;
                }
            }
            str += ch;
        }
        return str;
    }
    public static void main(String[] args) {
        String[] str = {"Flower", "Fly", "Flow"};
        System.out.println("Longest common prefix:" +solve(str));
    }
}
