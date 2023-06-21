package Linkedlist;

public class LinkedlistWarmUp {

    public void print(Node head) {
        Node start = head;
        while(start != null) {
            System.out.println(start.data + " -> ");
            start = start.next;
        }
    }

    public void insertAtHead(Node head, int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(Node head, int data, int pos) {
        if(pos == 0) {
            insertAtHead(head, data);
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void reverseLinkedList(Node head) {

    }
}
