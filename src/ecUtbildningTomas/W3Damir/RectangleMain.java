package ecUtbildningTomas.W3Damir;

public class RectangleMain {
    public static void main(String[] args) {
        // Skapa objekt (4.)
        Rectangle rect = new Rectangle(8, 8);
        int area = rect.calculateArea();
        int perimeter = rect.calculatePerimeter();
        // boolean (6.)
        boolean sqare = rect.isSquare();

        System.out.println("Rectangle arean är: " +area);
        System.out.println("Rectangle omkretsen är: " +perimeter);
        if(sqare) {
            System.out.println("Rectangle är en kvadrat!");
        }
    }
}
