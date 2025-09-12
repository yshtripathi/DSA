package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String s;
        String t;
        s = sc.next();
        System.out.println(s);
        sc.nextLine();
        t = sc.nextLine();
        System.out.println(t);
         */
        String s  = "Yash Tripathi";
        System.out.println(s.charAt(7));
        System.out.println(s.length());
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('i'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("Hello"));
        System.out.println(s.startsWith("Yash"));
        System.out.println(s.endsWith("World"));
        System.out.println(s.concat("!!!!"));
        System.out.println(s.substring(6,8));
        s = s + " is Ghost of Uchiha";
        System.out.println(s);
        int n = 12;
        String y = String.valueOf(n);
        String q = Integer.toString(n);
        System.out.println(y);
        System.out.println(q);
        String e  = "123456";
        int w = Integer.parseInt(e);
        System.out.println(w);
        int r  = Integer.valueOf(e);
        System.out.println(r);
        char[] ch = s.toCharArray();
        for(char c: ch){
            System.out.print(c + " ");
        }
    }
}
