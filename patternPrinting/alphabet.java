package Pattern_Printing;

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows:");
        int m=sc.nextInt();
//        System.out.println("enter the no of rows:");
//        int n=sc.nextInt();
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }

}
