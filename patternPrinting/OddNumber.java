package Pattern_Printing;
import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows:");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            int num=1;
            for (int j = 1; j <= i; j++) {
                    System.out.print(num+ " ");
                num += 2;
                }
            System.out.println();
        }
    }
}
