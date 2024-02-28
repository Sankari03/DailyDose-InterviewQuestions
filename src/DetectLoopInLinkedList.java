class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class DetectLoopInLinkedList {
    public static boolean detectLoop(Node head){
        Node first = head;
        Node second = head;

        while(first != null && second != null && second.next!=null){
            first = first.next;
            second = second.next.next;
            if(first==second){
                return true;
            }
        }
        return false;
    }
}
