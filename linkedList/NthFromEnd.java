package LinkedList;

public class NthFromEnd {
    public static class node {
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    node head;
    public  node nthNodeM1(int n){
        node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int a = size-n+1;
        for(int i=1;i<=a-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public  node nthNodeM2(int n){
        node slow= head;
        node fast = head;
        for(int i =1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        NthFromEnd ll = new NthFromEnd();
        node a = new node (1);
        node b = new node (2);
        node c = new node (3);
        node d = new node (4);
        node e = new node (5);
        node f = new node (6);
        ll.head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
       node p= ll.nthNodeM2(2);
        System.out.println("the result is "+ p.data );
        node q= ll.nthNodeM2(4);
        System.out.println("the result is "+ q.data );
    }
}
