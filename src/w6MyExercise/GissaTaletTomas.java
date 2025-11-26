package w6MyExercise;

import java.util.Scanner;

public class GissaTaletTomas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fråga användaren om ett tal n
        System.out.println("Mata in högsta talet n:");
        int n = scanner.nextInt(); // glöm inte att omvandla den !!!

        // Slumpa tal mellan 0 och n
        int tal = (int)(Math.random() * (n + 1));
        int gissning = -1; // något som inte kan vara rätt

        // While loop till gissningen är rätt
        while (gissning != tal) {
            System.out.println("Gissa ett tal mellan 0 och " + n + ".");
            gissning = scanner.nextInt();

            // Kontroll
            if (gissning < 0 || gissning > n) {
                System.out.println("Fel: talet måste vara mellan 0 och " + n + ".");
            }
            else if (gissning < tal) {
                System.out.println("För lågt!");
            }
            else if ( gissning > tal) {
                System.out.println("För högt!");
            }
            else {
                System.out.println("Rätt! Grattis!");
            }
        }

        scanner.close();
    }
}
 // Mata in högsta talet N
// Slumpa ett tal mellan 0 och N
//gissa talet datorn svarar
//För Högt, för lågt eller Rätt !