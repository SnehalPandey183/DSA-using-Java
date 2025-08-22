package Pattern_Printing;
import java.util.Scanner;
public class stardiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int i =1; i<n+1; i++){
            for (int j= 1; j<n+1 ; j++){
                if(i==j || i+j==6)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}