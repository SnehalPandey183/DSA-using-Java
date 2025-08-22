package LinkedList;

public class insertionFromStart {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    void display(){
        node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
//    node head = null;
//    node tail = null;
//    public void insertAtHead(int val) {
//        node temp = new node(val);
//        if (head == null) {
//            head = temp;
//            tail = temp;
//        } else {
//            temp.next = head;
//            head = temp;
//        }
//    }
    node head= null;
    public  void IAH(int val ) {
        node temp = head;
        node t = new node(val);
        while (temp.next != null) {
            temp = temp.next;
        }
        node tail = temp;
        temp = head;
        if (temp == null) {
            head = t;
            tail = t;
        } else {
            t.next = head;
            head = t;
        }
    }
    public static void main(String[] args) {
        insertionFromStart ll = new insertionFromStart();
       node a = new node (1);
       node b = new node (2);
       node c = new node (3);
       ll.head = a;
       a.next = b;
       b.next = c;
       ll.IAH(0);
        ll.display();
    }

}
