import java.text.DecimalFormat;

public class Cone extends Shape{
    // Attribute
    protected double radius;
    protected double height;

    // Constructer
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //Override
    @Override // A=πr(r+sqrt(h^2+r^2))
    double surface_area() {
        double surfaceArea = (Math.PI * radius) * (radius + Math.sqrt(Math.pow(radius, 2)) + Math.pow(height, 2));
        return surfaceArea;
    }
    @Override // V=(h/3)πr^2
    double volume() {
        double volume = (height / 3) * Math.PI * Math.pow(radius, 2);
        return volume;
    }

    //Decimal formatting
    DecimalFormat df = new DecimalFormat("0.##");
    
    //toString
    @Override
    public String toString() {
        return "Surface area of the cone is " + df.format(surface_area()) + "\n" + "Volume of the cone is " + df.format(volume());
    }
}
