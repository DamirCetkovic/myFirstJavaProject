package oop;

public class Calculator16 {
    // Attribut
    public double a;
    public double b;

    // Konstruktor
    public Calculator16(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double addera() {
        return a + b;
    }

    public double subtrahera() {
        return a - b;
    }

    public double multiplicera() {
        return a * b;
    }

    public double dividera() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Fel: kan inte dividera med 0!");
            return 0;
        }
    }
}
