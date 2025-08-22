package Stacks;

import java.util.Stack;

public class arrayImplementationOfStacks  {
    public static class stack{
        int [] arr = new int[5];
        int idx = 0;
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        void push (int x){
            if(idx==arr.length){
                System.out.println("stack is full");
                return;
            }
            arr [idx]= x;
            idx++;
        }
        int peak(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
    }

    public static void main(String[] args) {

        stack st = new stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.pop());
    }
}
