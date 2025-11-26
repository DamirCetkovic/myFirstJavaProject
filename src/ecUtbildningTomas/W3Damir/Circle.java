package ecUtbildningTomas.W3Damir;

public class Circle {
    private double radius;

    //Konstruktor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Metod att räkna ut area:
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Metod att räkna ut omkrets:
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    // Metod boolean isBiggerThan
    public boolean isBiggerThan(Circle other) {
        return this.calculateArea() > other.calculateArea();
    }

    public double getRadius() {
        return radius;
    }
}
