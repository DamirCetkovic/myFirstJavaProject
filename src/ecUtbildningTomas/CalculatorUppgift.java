package ecUtbildningTomas;

public class CalculatorUppgift {
    int tal1, tal2; // Attribut, instns variabler

    // Konstruktor
    public CalculatorUppgift(int tal1, int tal2) {
        //x&B parametrar finns bara i kodblocket
        this.tal1 = tal1;
        this.tal2 = tal2;
    }

    // Skapa en metod som skriver ut addition för dessa tal.
    public int addition() {
        int summa = tal1 +tal2;
        return summa; // return tal1+tal2;
    }
    public int subtraktion() {
        return tal1 - tal2;
    }
    public double division() {
        return (double) tal1 / tal2;
    }
    public int multiplikation() {
        return tal1 * tal2;
    }

}
