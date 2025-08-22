package LinkedList;

public class Lengthll {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }
    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int size(node head) {
        node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        node a = new node(4);
        node b = new node(2);
        node c = new node(8);
        node d = new node(4);
        node e = new node(9);
        a.next= b;
        b.next= c;
        c.next= d;
        d.next =e;
        display(a);
        System.out.println(size(a));
    }
}
