import java.text.DecimalFormat;

public class Sphere extends Shape {
    // Attribute
    protected double radius;

    // Constructer
    public Sphere(double radius) {
        this.radius = radius;
    }

    //Override
    @Override // 4πr^2
    double surface_area() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }
    @Override // V=4/3πr^3
    double volume() {
        double volume = 4/3 * Math.pow(radius, 3) * Math.PI;
        return volume;
    }

    //Decimal formatting
    DecimalFormat df = new DecimalFormat("0.##");
    
    //toString
    @Override
    public String toString() {
        return "Surface area of the sphere is " + df.format(surface_area()) + "\n" + "Volume of the sphere is " + df.format(volume());
    }
}