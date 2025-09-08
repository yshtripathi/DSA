package linked_List;
public class ArrToLL {
    static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {12, 2, 34, 5, 6, 7, 8};
        Node y = new Node(1);
        Node head = convertArrToLL(arr);
        System.out.println(head.data);
    }
}
