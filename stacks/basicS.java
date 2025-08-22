package Stacks;
import java.util.Stack;
public class basicS {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);//1 2 3 4 5 6 7 8
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        while(st.size()>4){
            st.pop();
        }
        System.out.println((st.peek()));
        System.out.println(st);
    }
}
