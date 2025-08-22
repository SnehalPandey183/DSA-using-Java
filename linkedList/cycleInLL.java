package LinkedList;

public class cycleInLL {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static boolean CyclicLL(node head) {
        node slow = head;
        node fast = head;
        if (head.next == null) {
            return false;
        }
        while (fast != null) {
            if (slow == null) return false;
            slow = slow.next;
            if (fast.next == null) return false;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        node a = new node (1);
        node b = new node (2);
        node c = new node (3);
        node d = new node (4);
        node e = new node (5);
        a.next = b;
        b.next= c;
        c.next = d;
        d.next = e;
        e.next = a;
       // CyclicLL(a);
        System.out.println(CyclicLL(a));
    }
}
