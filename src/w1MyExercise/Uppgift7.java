package w1MyExercise;

public class Uppgift7 {
    public static void main(String[] args) {
        // Definera indatavärden
        double liter = 62.0;    // antal liter
        double ppLiter = 21.16; // pris per liter
        double rabatt = 0.12;    // rabatt i decimal (12%)

        // Beräkna pris utan rabatt
        double pris = liter * ppLiter;

        // Beräkna prise efter rabatt
        double prisMedRabatt = pris * (1 - rabatt);

        // Skriv ut resultaten
        System.out.println();
        System.out.println("Pris utan rabatt: " + pris + " kr");
        System.out.println();
        System.out.println("Din rabatt är: " + pris * rabatt + " kr");
        System.out.println();
        System.out.println("Pris med rabatt: " + prisMedRabatt + " kr");


    }
}
