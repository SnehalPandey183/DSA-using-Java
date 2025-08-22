package LinkedList;

public class getElement {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static int elementAt(node head, int idx){
        node temp = head;
        for(int i=1; i<=idx;i++){
            temp = temp.next;
        }
        return temp.data;
    }
//    public static void display(node head){
//        node temp = head;
//        while(temp!= null){
//            System.out.print(temp.data+" ");
//            temp= temp.next;
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        node a = new node (1);
        node b = new node (2);
        node c = new node (3);
        node d = new node (5);
        node e = new node (6);
        node f = new node (7);
        node g = new node (8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(getElement.elementAt(a,4));
        //display(a);
    }
}
