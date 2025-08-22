package Pattern_Printing;

import java.util.Scanner;

public class starplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(n%2==0 && (j==n/2||i==n/2)) {
                    System.out.print("*");}
                else{
                    System.out.print( " ");
                }
                if(n%2!=0 && (j==n/2+1||i==n/2+1)) {
                    System.out.print("*");}
                else{
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
    }
}
