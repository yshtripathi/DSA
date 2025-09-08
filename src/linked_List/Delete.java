package linked_List;

public class Delete {
    static Node convertToLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node removeHead(Node head){
        Node temp = head;
        head = head.next;
        return head;
    }
    static Node removeTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node head = convertToLL(arr);
        //head = removeHead(head);
        head = removeTail(head);
        traverse(head);
    }
}
