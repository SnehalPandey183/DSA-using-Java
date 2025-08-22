package LinkedList;

public class insertionFromEnd {
    public static class Node{
      int data;
      Node next;
      Node(int data){
          this.data=data;
      }
 }
    static int size=0;
    Node head = null;
    //Node tail = null;
   public  void insertAtTail(int val) {
       Node temp = new Node(val);
       Node t = head;
       while(t.next!=null) {
           t = t.next;
       }
       Node tail = t;
       if (head == null) {
           head = temp;
           tail = temp;
       } else {
           tail.next = temp;
           tail = temp;
       }
   }
        void display(){
           Node temp = head;
           while(temp!=null){
               System.out.print(temp.data+" ");
               temp=temp.next;
               size++;
           }
           System.out.println();
   }

    public static void main(String[] args) {
        insertionFromEnd ll= new insertionFromEnd();
          Node a = new Node (5);
          Node b = new Node (2);
          ll.head = a;
          a.next = b;
          ll.insertAtTail(4);
          ll.insertAtTail(5);
          ll.insertAtTail(2);
        ll.insertAtTail(7);
        ll.insertAtTail(9);
        ll.insertAtTail(3);
        ll.display();
        System.out.println("the size is:"+ll.size);
    }
}
