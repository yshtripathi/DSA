package linkedList;
/*
Insert at head
Insert at tail
Insert at kth position
Insert new value before a targeted value
 */

public class Insert {
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
    static Node insertHead(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
    }
    static Node insertTail(Node head, int val){
        if(head == null){
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    static Node insertKposition(Node head, int val, int k){
        if(head == null){
            if(k == 1){
                return new Node(val);
            }
            else return null;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
                count++;
            if(count == k-1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    static Node insertBeforeValue(Node head, int targetVal, int newVal){
        if(head == null){
            return null;
        }
        if(head.data == targetVal){
            Node newNode = new Node(newVal);
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == targetVal){
                Node newNode = new Node(newVal);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,0};
        Node head = arrToLL(arr);
        //head = insertHead(head, 10);
        //head = insertTail(head, 100);
        //head = insertKposition(head, 40, 5);
        head = insertBeforeValue(head, 4, 14);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
