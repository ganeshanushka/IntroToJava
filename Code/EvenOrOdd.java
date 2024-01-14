// Program to check if the given number is an even or odd number
import java.util.*;
public class EvenOrOdd {
    public static void main(String []args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        // Check if n is even
        if(n % 2 == 0) { // If n is even, dividing by 2 will leave no remainder!
            System.out.println(n + " is an even number");
        }
        // Check if n is odd
        if(n % 2 != 0) {
            System.out.println(n + " is an odd number");
        }
    }
}
