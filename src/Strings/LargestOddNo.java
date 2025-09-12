package Strings;

public class LargestOddNo {
    static String solve(String s){
        for(int i = s.length()-1; i >= 0; i--){
            if((s.charAt(i)-'0')%2 != 0){
                String s1 = s.substring(0,i+1);
                return s1;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String str ="12345678";
        System.out.println("Largest odd Number in String: " +solve(str));
    }
}
