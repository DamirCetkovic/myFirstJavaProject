package ecUtbildningTomas.W3Damir;

public class CircleMain {
    public static void main(String[] args) {

        Circle circ1 = new Circle(6.1);
        Circle circ2 = new Circle(5.4);

        double area = circ1.calculateArea();
        double perimeter = circ1.calculateCircumference();

        boolean result = circ1.isBiggerThan(circ2);

        System.out.println("Cirkelns area är: " +area);
        System.out.println("Cirkelns omkrets är: " +perimeter);
        if(result) {
            System.out.println("circ1 har större area än circ2");
        } else {
            System.out.println("circ1 är inte större än circ2");
        }

    }
}
