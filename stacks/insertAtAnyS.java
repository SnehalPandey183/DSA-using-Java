package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class insertAtAnyS {
    public static void main(String[] args) {
          Stack <Integer> st = new Stack <>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        int idx = 2;
//        int val = 7;
//        Stack<Integer> temp = new Stack<>();
//        while(st.size()>idx-1){
//            temp.push(st.pop());
//        }
//        st.push(val);
//        while(temp.size()>0){
//            st.push(temp.pop());
//        }
//        System.out.println(st);
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("enter the no of elements:");
        n= sc.nextInt();
        System.out.println("enter the elements:");
        for(int i=1; i<=n;i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        System.out.println("enter the index on which you want to insert");
        int idx = sc.nextInt();
        System.out.println("put the value:");
        int val=sc.nextInt();
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx-1){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
