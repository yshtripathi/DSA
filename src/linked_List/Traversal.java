package linked_List;

public class Traversal {
    public static Node traverse(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static int Search(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,6,7};
        Node head = traverse(arr);
        Node temp = head;
        int count = 0;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        System.out.println();
        System.out.println("Length of the Linked List: " +count);
        System.out.println("Search an element: " +Search(head, 23));
    }
}
