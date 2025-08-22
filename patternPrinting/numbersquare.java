package Pattern_Printing;
import java.util.Scanner;
public class numbersquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int i =1; i<n+1; i++){
            for (int j= 1; j<n+1 ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
