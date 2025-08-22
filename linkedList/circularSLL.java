package LinkedList;

public class circularSLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp.next!= head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void display2(Node head){
        Node temp = head.next;
        while(temp!= head){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node (12);
        Node b = new Node (9);
        Node c = new Node (22);
        Node d = new Node (90);
        circularSLL.display(a);
        circularSLL.display2(a);
    }
}
