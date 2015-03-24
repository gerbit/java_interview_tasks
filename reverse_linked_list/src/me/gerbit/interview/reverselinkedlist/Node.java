package me.gerbit.interview.reverselinkedlist;

public class Node {
    private int i;

    public Node next;

    Node(int i) { this.i = i; }

    public int getValue() { return i; }

    public static void main(String [] args) {
        Node list = new Node(0);
        Node head = list;
        for (int i = 1; i < 10; i++) {
            Node node = new Node(i);
            head.next = node;
            head = node;
        }
        head = list;
        while (head != null) {
            System.out.print(head.getValue());
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }

        System.out.println();

        head = reverse(list);
        while (head != null) {
            System.out.print(head.getValue());
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}