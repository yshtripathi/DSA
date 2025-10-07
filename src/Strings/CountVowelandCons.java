package Strings;

public class CountVowelandCons {
    public static void main(String[] args) {
        String s  = "My Country is India";
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int vow = 0;
        int cons = 0;
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for(int j = 0; j < ch.length; j++){
        if(ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' ||ch[j] == 'u'){
            vow++;
        }
        else{
            cons++;
        }
        }

        for(int j = 0; j < ch.length; j++){
            if(ch[j] == 'a') {
                a++;
            }
            else if(ch[j] == 'e') {
                e++;
            }
            else if(ch[j] == 'i') {
                i++;
            }
            else if(ch[j] == 'o') {
                o++;
            }
            else if(ch[j] == 'u') {
                u++;
            }
        }
        System.out.println("Number of vowels and consona in the string are: " +vow +" " +cons);
        System.out.println( ""+a);
        System.out.println(e);
        System.out.println(i);
        System.out.println(o);
        System.out.println(u);
    }
}
