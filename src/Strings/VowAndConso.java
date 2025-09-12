package Strings;

public class VowAndConso {
    public static void main(String[] args) {
        String str = "hsdikhgoiefhjkfsdbjkvnjvkihvdiefhjksdvbjksvbsmdn";
        int vow = 0;
        int conso = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o'|| ch == 'u'){
                vow++;
            }
            else{
                conso++;
            }
        }
        System.out.println("Number of Vowels in the string are " +vow+ " and consonants are " +conso);
    }
}
