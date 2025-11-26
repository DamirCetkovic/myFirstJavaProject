package oop;

// Klassen FruktSalad innehåller main-metoden
public class FruktSalad {

    public static void main(String[] args) {

        // Skapar tre olika frukter
        Frukt apple = new Frukt("röd");
        Frukt kiwi = new Frukt("grön");
        Frukt banan = new Frukt("gul");

        // Skrver ut färgerna på frukterna
        apple.printColor();
        kiwi.printColor();
        banan.printColor();
    }
}
