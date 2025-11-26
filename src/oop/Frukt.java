package oop;

// Klassen Fruit beskriver en frukt
public class Frukt {

    // Attributer som lagar fruktens färg
    public String color;

    //Konstuktor - körs när vi skapar n frukt
    public Frukt(String color) {
        this.color = color;
    }

    // En metod som skriver ut färgen på frukten
    public void printColor() {
        System.out.println("Fruktens färg är: " + color);
    }

}
