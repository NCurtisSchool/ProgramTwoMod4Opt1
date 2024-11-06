import java.text.DecimalFormat;

public class Cylinder extends Shape{
    // Attribute
    protected double radius;
    protected double height;

    // Constructer
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //Override
    @Override // A=2πrh+2πr^2
    double surface_area() {
        double surfaceArea = (2 * radius * Math.PI * height) + (2 * Math.PI * Math.pow(radius, 2));
        return surfaceArea;
    }
    @Override // V=πhr^2
    double volume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }

    //Decimal formatting
    DecimalFormat df = new DecimalFormat("0.##");
    
    //toString
    @Override
    public String toString() {
        return "Surface area of the cylinder is " + df.format(surface_area()) + "\n" + "Volume of the cylinder is " + df.format(volume());
    }
}
