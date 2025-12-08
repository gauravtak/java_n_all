package MergeSort;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int size;
}

public class MergeSortLinkedList {

    public static Node getMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Linked Lists use slow and fast pointers for mid point calculation

        Node slow = head;
        Node fast = head.next;

        if (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node merge(Node left, Node right) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
        }

        while (left != null) {
            tail.next = left;
            left = left.next;
        }

        while (right != null) {
            tail.next = right;
            right = right.next;
        }

        return dummy.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node secondHalf = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(secondHalf);

        return merge(left, right);
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }

}

// 1 3 4 5 6