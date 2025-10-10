package linkedList;

import javax.xml.transform.Source;
import java.util.Stack;

public class PallindromeLL {
    static boolean checkPalindrome(Node head){
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.data != st.peek()){
                return false;
            }
            temp = temp.next;
            st.pop();
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(1);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        if(checkPalindrome(head)){
            System.out.println("LL is palindrome");
        }
        else
            System.out.println("LL is not palindrome");
    }
}
