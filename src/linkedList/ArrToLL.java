package linkedList;

public class ArrToLL {
   static Node ArrayToLL(int arr[]){
       Node head = new Node(arr[0]);
       Node mover = head;
       for(int i = 1; i < arr.length; i++){
           Node temp = new Node(arr[i]);
           mover.next = temp;
           mover = temp;
       }
       return head;
   }
    public static void main(String[] args) {
        int[] arr = {1,2,3,45};
        Node head = ArrayToLL(arr);
        System.out.println(head.data);
    }
}
