package linkedList;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLoop {
    static int length(Node head){
        Map<Node, Integer> map = new HashMap<>();
        Node temp = head;
        int timer = 1;
        while(temp != null){
            if(map.containsKey(temp)){
                int length = timer - map.get(temp);
                return length;
            }
            map.put(temp, timer);
            temp = temp.next;
            timer++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth  = new Node(4);
        Node fifth = new Node(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
        int length = length(head);
        System.out.println("Length of the loop in Linked List " +length);
    }
}
