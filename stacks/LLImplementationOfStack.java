package Stacks;

public class LLImplementationOfStack {
    public static class node {
        int val;
        node next;

        node(int val) {
            this.val = val;
        }
    }

    public static class LLstack {
        private node head = null;
        private int size = 0;

        void push(int x) {
            node temp = new node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayrec(node h) {
            if (h == null) return;
            displayrec(h.next);
            System.out.print(h.val + " ");
        }

        void display() {
            displayrec(head);
            System.out.println();
        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        LLstack st = new LLstack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.size());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
