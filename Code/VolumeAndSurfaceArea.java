// Program to find the volume and surface area of a sphere whose radius is given
public class VolumeAndSurfaceArea {
    public static void main(String []args) {
        // Declaration and initialization
        double radius = 5.5;
        double volume;
        double surfaceArea;

        // Calculation
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        surfaceArea = 4 * Math.PI * radius * radius;

        // Display
        System.out.println("The volume of the sphere of radius " + radius + " is = " + volume);
        System.out.println("The surface area of the sphere of radius " + radius + "is = " + surfaceArea);
    }
}
