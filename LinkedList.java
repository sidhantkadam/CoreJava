class LinkedListNode {
    public LinkedListNode next;
    public int data;

    public LinkedListNode(int data) {
        this.next = null;
        this.data = data;
    }
}

public class LinkedList {
    public static void printLinkedList(LinkedListNode head) {
        LinkedListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            System.out.print(" -> ");
            curr = curr.next;
        }
    }

    public static LinkedListNode reverseLinkedList(LinkedListNode head) {
        LinkedListNode curr = head;
        LinkedListNode prev = null;

        while (curr != null) {
            LinkedListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static LinkedListNode findMiddle(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedListNode insertAtEnd(LinkedListNode head, int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        LinkedListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public static LinkedListNode insertAtIndex(LinkedListNode head, int data, int index) {
        LinkedListNode newNode = new LinkedListNode(data);
        LinkedListNode curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public static void deleteNode(LinkedListNode head, int index) {
        LinkedListNode curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    public static LinkedListNode removeDuplicate(LinkedListNode head) {
        LinkedListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        head.next.next.next = new LinkedListNode(40);

        LinkedListNode head1 = insertAtIndex(head, 40, 4);
        printLinkedList(head1);
        System.out.println();

        LinkedListNode head2 = removeDuplicate(head1);
        printLinkedList(head2);
    }
}

