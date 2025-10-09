package linkedList;

public class DeleteMiddle {
    static Node deleteMiddle(Node head){
        Node temp =  head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int mid = count/2;
        temp = head;
        while(temp != null){
            mid--;
            if(mid == 0){
                Node middle = temp.next;
                temp.next =  temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth  = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;
        head = deleteMiddle(head);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
