package linkedList;

import java.util.HashMap;
import java.util.Map;

public class DetectLoop {
    static boolean detect(Node head){
        Map<Node, Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,1);
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next.next;
        if(detect(head)){
            System.out.println("Loop exists in the Linked List");
        }
        else {
            System.out.println("Loop doesn't exist in the Linked List");
        }
    }
}
