package LINKEDLIST.main;

public class reversing {
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private void reverse(Node node){
        if(node == tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public static void main(String[] args) {

    }
}
