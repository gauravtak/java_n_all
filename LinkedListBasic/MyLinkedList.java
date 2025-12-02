package LinkedListBasic;

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;
    int size;

    void addFirst(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = head;
        head = newNode;
        size++;
    }

    void addLast(int value) {
        Node newNode = new Node();
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        newNode.data = value;
        curr.next = newNode;
        size++;
    }

    void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    // to remove the last element you need to stop at the second last element
    void removeLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        size--;
    }

}

public class MyLinkedList {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // LinkedList l1 = new LinkedList();

        // System.out.println(l1);

        // l1.addFirst(5);

        // System.out.println(l1);

    }
}
