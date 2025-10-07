package linkedList;

import java.util.Stack;

public class ReverseLL {
    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node reverse(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Original Linked List");
        printList(head);
        head = reverse(head);
        System.out.println("Reversed Linked List");
        printList(head);

    }
}
