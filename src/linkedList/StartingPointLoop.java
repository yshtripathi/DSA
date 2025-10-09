package linkedList;

import java.util.HashMap;
import java.util.Map;

public class StartingPointLoop {
    static Node startingPointOfLoop(Node head){
        Node temp = head;
        Map<Node, Integer> map = new HashMap<>();
        while(temp != null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp, 1);
            temp = temp.next;
        }
        return null;
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
        Node start = startingPointOfLoop(head);
        System.out.println("Starting Point of Loop in the Linked List " +start.data);
    }
}
