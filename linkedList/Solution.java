package LinkedList;

public class Solution {
    public static class node {
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    node head = null;
        void display () {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(4);
        Solution ll = new Solution();
        ll.head= a;
        a.next = b;
        b.next = c;
        ll.display();
        //System.out.println(ll.head);
    }
}
