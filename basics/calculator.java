package ArithematicOperations;
import java.util.Scanner;
class add {
    int sum(int a, int b) {
        return a + b;
    }
}
class subtract {
    int sub(int a, int b) {
        return a - b;
    }
}
class multiply {

    int mul(int a, int b) {
        return a * b;
    }
}
class divide {
    double div(double a, double b) {
        return a / b;
    }
}

public class calculator {
    public static void main(String[] args) {
        add obj = new add();
        subtract obj1 = new subtract();
        multiply obj2 = new multiply();
        divide obj3 = new divide();

        Scanner sc = new Scanner (System.in);
        System.out.println("enter your first input you want the operation for: ");
        int x=sc.nextInt();
        System.out.println("enter your second input you want the operation for: ");
        int y = sc.nextInt();

        System.out.println("press 1 for addition,2 for subtraction,3 for multiplication and 4 for division");
        int n= sc.nextInt();
        switch (n){
            case 1:
                int ans1 = obj.sum(x,y);
                System.out.println(" your ans is "+ ans1);
                break;
            case 2:
                int ans2 = obj1.sub(x,y);
                System.out.println(" your ans is "+ ans2);
                break;
            case 3:
                int ans3 = obj2.mul(x,y);
                System.out.println( " your ans is "+ ans3);
                break;
            case 4:
                double ans4 = obj3.div(x,y);
                System.out.println( " your ans is "+ ans4);
                break;
        }
    }
}
