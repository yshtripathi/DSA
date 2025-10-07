package linkedList;
/*
Linked List from an array
Length of Linked List
Search an element present in Linked List
Traverse and Print Linked List
*/

public class MajorOperations {
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
    static int lengthofLL(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    static int checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return 1;
            }
            temp = temp.next;
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Node head = arrToLL(arr);
        int length = lengthofLL(head);
        int val = checkIfPresent(head, 4);
        System.out.println(val);
        System.out.println("Length of LL " +length);
        Node temp = head;
        //traversal of Linked List and print all nodes
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
