package linkedList;
/*
Delete head
Delete tail
Delete kth element
Delete value
 */

public class Delete {
    static Node arrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    static Node deleteHead(Node head){
        if(head == null){
            return head;
        }
        Node temp = head;
        head = temp.next;
        return head;
    }
    static Node deleteTail(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static Node deleteKElement(Node head, int val) {
        if(head == null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while(temp != null){
            {
                count++;
            }
            if(count == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    static Node deleteValue(Node head, int val){
        if(head == null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == val){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Node head = arrToLL(arr);
        //head = deleteHead(head);
        //head = deleteTail(head);
        //head = deleteKElement(head, 2);
        head = deleteValue(head, 8);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
