// Program to simulate a simple calculator
public class SimpleCalculator {
    public static void main (String []args)
    {
        // Declaration
        int a;
        int b;
        int sum;
        int difference;
        int product;
        int quotient;
        int remainder;

        // Initialization
        a = 20;
        b = 10;

        // Calculation
        sum = a+b;
        difference = a-b;
        product = a*b;
        quotient = a/b;
        remainder = a%b;

        // Display
        System.out.println(a+"+"+b+"="+sum);
        System.out.println(a+"-"+b+"="+difference);
        System.out.println(a+"*"+b+"="+product);
        System.out.println(a+"/"+b+"="+quotient);
        System.out.println(a+"%"+b+"="+remainder);
    }
}
