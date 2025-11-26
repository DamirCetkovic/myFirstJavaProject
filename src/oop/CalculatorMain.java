package oop;
// Importera Scanner

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        // Skapa Scanner
        Scanner scan = new Scanner(System.in);

        // Läs in två tal
        System.out.println("Skriv in första talet:");
        double tal1 = scan.nextDouble();

        System.out.println("Skriv in andra talt:");
        double tal2 = scan.nextDouble();

        // Skapa objekt av Calculator och skicka in talen
        Calculator minKalkylator = new Calculator(tal1, tal2);

        // Anropa metoden
        minKalkylator.addera();
        minKalkylator.subtrahera();
        minKalkylator.multiplicera();
        minKalkylator.dividera();

        /* Division med kontroll (så a eller b är inte 0)
        if (tal1 != 0) {
            minKalkylator.dividera();
            System.out.println("Kan inte dividera med 0!");
        }
        if (tal2 != 0) {
            minKalkylator.dividera();
            System.out.println("Kan inte dividera med 0!");

        }
*/
    }

}
