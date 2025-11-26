package w6MyExercise;

import java.util.Scanner;

public class MyRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Användaren anger ett tal
        System.out.print("Ange ett tal n (>= 0): ");
        int n = scanner.nextInt();

        // Kontrollerar "n"
        if (n < 0) {
            System.out.println("Fel: n måste vara 0 eller större.");
            return;
        }
        // Generera random 0 till n (inklusive)
        int rand = (int) (Math.random() * (n + 1));

        System.out.println("Slumptal mellan 0 och " + n + ": " + rand);

        scanner.close();
    }
}




//Skapa ett program som genererar och skriver ut
// ett slumpmässigt heltal mellan 0 och ett av användaren angivet tal n.