package linkedList;

public class ReverseLL1 {
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
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next =new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Original Linked List");
        printList(head);
        head = reverse(head);
        System.out.println("Reversed Linked List");
        printList(head);
    }
}
