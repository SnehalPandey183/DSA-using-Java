package Stacks;
import java.util.*;
public class removeConsecSubseq {
    public static int[] remove(int [] arr){
        int n = arr.length;
        Stack <Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0||arr[i]!=st.peek()) st.push(arr[i]);
            else if (arr[i]==st.peek()){
                if(i==n-1||arr[i]!=arr[i+1]) st.pop();
            }
        }
        int []res =new int [st.size()];
        int m= res.length;
        for(int i=m-1;i>=0;i--){
            res[i]= st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array" );
        int n = sc.nextInt();
        System.out.println("enter the elements:");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i]= sc.nextInt();
        }
       // int [] arr= {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int []x = remove (arr);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
