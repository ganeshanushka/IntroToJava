// Program to accept the name, age, phone number, and marks of a student and display them
import java.util.*;
public class StudentInformation {
    public static void main(String []args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your phone number: ");
        long phoneNumber = sc.nextLong();

        System.out.println("Enter your marks: ");
        double marks = sc.nextDouble();

        // Display
        System.out.println("Welcome " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your phone number is " + phoneNumber);
        System.out.println("Your marks are " + marks);
    }
}
