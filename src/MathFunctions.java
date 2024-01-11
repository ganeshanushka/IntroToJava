// Program with Math.pow, Math.PI, Math,sqrt functions
public class MathFunctions {
    public static void main(String []args) {
        // Math.pow
        double result = Math.pow(10,2);
        System.out.println("Result = " + result);
        // OR
        System.out.println("Result = " + Math.pow(10,2));

        // Math.PI
        double area_circle;
        double radius = 5.5;

        area_circle = (Math.PI * radius * radius);
        System.out.println("Area of circle of radius " + radius + " is = " + area_circle);

        // Math.sqrt
        double Result = Math.sqrt(25);
        System.out.println("Result = " + Result);
        // Or
        System.out.println("Result = " + Math.sqrt(25));
    }
}
