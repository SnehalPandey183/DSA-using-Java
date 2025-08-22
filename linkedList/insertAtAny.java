package LinkedList;

public class insertAtAny {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }
    void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void insertAt(node head,int idx, int val) {
        node t = new node(val);
        node temp = head;
        for (int i = 1; i <= idx - 2; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
       insertAtAny m = new insertAtAny();
        m.insertAt(a,3, 9);
       //m.insertAt(a,6,8);

        m.display(a);
    }
}
