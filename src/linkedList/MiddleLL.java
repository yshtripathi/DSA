package linkedList;

public class MiddleLL {
    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node middle(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int mid = (count/2) + 1;
        temp = head;
        while(temp != null){
            mid -= 1;
            if(mid == 0){
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Original Linked List");
        printList(head);
        Node mid = middle(head);
        System.out.println("Middle Element of Linked List " +mid.data);

    }
}
