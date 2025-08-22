package LinkedList;

public class middleOfLL {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static int middleRNode(node head) {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static int middleLNode(node head) {
        node slow = head;
        node fast = head;
        while (fast.next!= null && fast.next.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void display(node head){
        node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        node a = new node (1);
        node b = new node (2);
        node c = new node (3);
        node d = new node (4);
        node e = new node (5);
        node f = new node (6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
         //int p = middleRNode(a);
        System.out.println("the right middle is:"+middleRNode(a));
        //int q = middleLNode(a);
        System.out.println("the left middle is:"+middleLNode(a));
    }
}
