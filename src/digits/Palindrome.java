package digits;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int revNo = 0;
        boolean isPalindrome = false;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int org = n;
        while(n > 0){
            int lastDigit = n % 10;
            n = n /10;
            revNo = (revNo * 10) + lastDigit;
        }
        if (revNo == org){
            isPalindrome = true;
            System.out.println(isPalindrome);
        }
        else {
            isPalindrome = false;
            System.out.println(isPalindrome);
        }
    }
}
