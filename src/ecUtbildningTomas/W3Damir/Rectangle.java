package ecUtbildningTomas.W3Damir;

public class Rectangle {
    // Attribut till bredd och höjd (1.)
    private int width;
    private int height;

    // Konstruktör tar in bredd och höjd
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    // Metod att räkna ut area (2.)
    public int calculateArea () {
        return width * height;
    }
    // Metod att räkna ut omkrets (3.)
    public int calculatePerimeter() {
        return 2 * (width + height);
    }
    // Metod isSquare (5.)
    public boolean isSquare() {
        return width == height;
    }

    // Lägg till getters, att kunna läsa fälten senare
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
