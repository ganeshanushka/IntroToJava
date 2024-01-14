// Program to convert Celsius to Fahrenheit and vice versa
public class TempConversion {
    public static void main(String []args) {
        // Declaration and initialization
        double c = 103.5;
        double f = 103.5;
        double fahrenheit;
        double celsius;

        // Conversion
        fahrenheit = (c * (9.0/5.0)) + 32.0;
        celsius = (f - 32.0) * (5.0/9.0);

        // Display
        System.out.println(f + " degree fahrenheit is = " + celsius + " degree celsius");
        System.out.println(c + " degree celsius is = " + fahrenheit + " degree fahrenheit");
    }
}
