package LinkedList;

public class deleteAtIndex {
    public static class node {
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    int size=0;
    node head;
     public  void daleteAt( int idx) {
         node temp = head;
         while (temp != null) {
             size++;
             temp = temp.next;
         }
         node tail = temp;
         temp = head;
         if (head == null) {
             System.out.println("list is empty");
             return;
         } else if (idx == 1) {
             head = head.next;
             size--;
             return;
         }
         if(idx>size){
             System.out.println("index out of bound");
         }
             for (int i = 1; i < idx - 1 ; i++) {
                 temp = temp.next;
             }
             temp.next = temp.next.next;
             size--;
     }
    public  void display(){
       node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
       System.out.println();
   }
    public static void main(String[] args) {
        deleteAtIndex ll = new deleteAtIndex();
        node a = new node (1);
        node b = new node (2);
        node c = new node (3);
        node d = new node (4);
        node e = new node (5);
        node f = new node (6);
        node g = new node (7);
        node h = new node (8);
        node i = new node (9);
        node j = new node (10);
        ll.head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        ll.display();
        ll.daleteAt(10);
        ll.display();
        //System.out.println();
    }
}
