package LinkedList;

public class intersectionOfLL {
    public static class
    node {
        int data ;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static int twoLLintersection(node headA, node headB){
        node tempA = headA;
        node tempB = headB;
        int lengthA=0;
        while(tempA !=null){
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB =0;
        while(tempB!=null){
            lengthB++;
            tempB= tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(lengthA > lengthB){
            int steps= lengthB-lengthA;
            for(int i=1;i<=steps;i++){
                tempA = tempA.next;
            }
        }
        else{
            int steps = lengthB-lengthA;
            for(int i=1;i<=steps;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!= tempB){
            tempA= tempA.next;
            tempB= tempB.next;
        }
        return tempA.data;
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
        node a = new node (87);
        node b = new node (100);
        node c = new node (13);
        node d = new node (4);
        node e = new node (5);
        node f = new node (12);
        node g = new node (10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        node A = new node (90);
        node B = new node (9);
//        node C = new node (5);
//        node D = new node (12);
//        node E = new node (10);
        A.next = B;
//        B.next = C;
//        C.next = D;
//        D.next = E;
        B.next = e;
//        e.next = f;
//        f.next = g;
        int  p=twoLLintersection(a,A);
        System.out.println(p);
    }
}
