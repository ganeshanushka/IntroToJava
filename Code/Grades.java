import java.util.*;
// Program to print the grade based on the marks obtained according to the following table
public class Grades {
    public static void main(String []args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int m = sc.nextInt();

        if(m>=80) {
            System.out.println("Grade A");
        }
        else if (m>=60 && m<80) {
            System.out.println("Grade B");
        }
        else if (m>=50 && m<60) {
            System.out.println("Grade C");
        }
        else if (m>=40 && m<50) {
            System.out.println("Grade D");
        }
        else if (m<40) {
            System.out.println("Grade E");
        }
    }
}
