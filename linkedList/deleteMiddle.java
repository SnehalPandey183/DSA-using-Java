package LinkedList;

public class deleteMiddle {
    public static class node {
        int data;
        node next;
        node(int data){
            this.data= data;
        }
    }
    public node deleteRmiddleElement(node head){
        if(head.next==null){
            return null;
        }
        else{
            node slow = head;
            node fast = head;
            while (fast.next != null && fast.next.next!= null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }
    public node deleteLmiddleElement(node head){
        node slow = head;
        node fast = head;
        while (fast.next.next!= null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        deleteMiddle ll = new deleteMiddle();
        node a= new node(1);
        node b= new node(2);
        node c= new node(3);
        node d= new node(4);
        node e= new node(5);
        node f= new node(6);
        //ll.head =a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ll.display(a);
        ll.deleteRmiddleElement(a);
        ll.display(a);
        ll.deleteLmiddleElement(a);
        ll.display(a);
    }
}
