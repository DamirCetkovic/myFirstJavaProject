package oop;

public class Calculator {
    // Attribut som spar talen ( double för att kunna hantera decimaltal)
    public double a;
    public double b;

    // Konstruktor: tar emot två tal när objektet skapas
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void addera() {
        double addera = a + b;
        System.out.println("Summan av a och b är: " + addera);
    }
    public void subtrahera() {
        double subtrahera = a - b;
        System.out.println("Differensen mellan a och b är: " + subtrahera);
    }
    public void multiplicera() {
        double multiplicera = a * b;
        System.out.println("Produkten av a och b är: " + multiplicera);
    }
    public void dividera() {
        double kvoten = a / b;
        System.out.println("Kvoten av a och b är: " + kvoten);

    }
}
