package LinkedList;

public class deleteNthFromEnd {
    public static class node{
        int data ;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static node deleteNthEndNode(node head, int n){
        node slow= head;
        node fast = head;
        for(int i=1;i<=n;i++){
            fast= fast.next;
        }
        if(fast==null){//for deleting the head i.e,last element from end
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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
        node a = new node (1);
        node b = new node (2);
        node c = new node (3);
        node d = new node (4);
        node e = new node (5);
        node f = new node (6);
        a.next= b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        a= deleteNthEndNode(a,6);
        display(a);
    }
}
