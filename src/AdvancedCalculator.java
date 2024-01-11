// Program to create an advanced calculator
import java.util.*;
public class AdvancedCalculator {
    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        // Declaration
        int a;
        int b;
        int operation;
        int sum;
        int difference;
        int product;
        int quotient;
        int remainder;

        // Accepting input from the user
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Choose your operation: ");
        System.out.println("(enter number preceding desired operation)");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Quotient");
        System.out.println("5. Remainder");
        operation = sc.nextInt();

        // Calculation and Display
        if(operation == 1) {
            sum = a+b;
            System.out.println(a+"+"+b+"="+sum);
        }
        else if(operation == 2) {
            difference = a-b;
            System.out.println(a+"-"+b+"="+difference);
        }
        else if(operation == 3) {
            product = a*b;
            System.out.println(a+"*"+b+"="+product);
        }
        else if(operation == 4) {
            quotient = a/b;
            System.out.println(a+"/"+b+"="+quotient);
        }
        else if(operation == 5) {
            remainder = a%b;
            System.out.println(a + "%" + b + "=" + remainder);
        }
        else {
            System.out.println("Error");
        }
    }
}

