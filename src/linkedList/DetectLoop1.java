package linkedList;

public class DetectLoop1 {
    static boolean detect(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
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
        if(detect(head)){
            System.out.println("Loop exists in the Linked List");
        }
        else {
            System.out.println("Loop doesn't exist in the Linked List");
        }
    }
}
