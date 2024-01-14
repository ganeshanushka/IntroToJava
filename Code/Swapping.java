// Program to swap two variables
public class Swapping {
    public static void main(String []args) {
        // Declaration and initialization
        int a = 10;
        int b = 20;
        int temp;

        // Display before swapping
        System.out.println("Before swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap
        temp = a;
        a = b;
        b = temp;

        //Display after swapping
        System.out.println("After swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
