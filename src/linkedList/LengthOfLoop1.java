package linkedList;

public class LengthOfLoop1 {
    static int length(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return findLength(slow, fast);
            }
        }
        return 0;
    }
    static int findLength(Node slow, Node fast){
        int count = 1;
        fast = fast.next;
        while(slow != fast){
            count++;
            fast = fast.next;
        }
        return count;
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
        System.out.println("Length of loop in the Linked List " +length);
    }
}
