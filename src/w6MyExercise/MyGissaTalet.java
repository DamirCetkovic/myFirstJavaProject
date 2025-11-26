package w6MyExercise;

import java.util.Scanner;

public class MyGissaTalet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tal = (int)(Math.random() * 100) + 1; // slumpmässigt tal 1-100
        int gissning = 0; // deklareras innan loopen

        while (gissning != tal) {
            System.out.print("Gissa ett tal mellan 1 och 100: ");
            gissning = scanner.nextInt();

            // Kontrollera att gissningen är giltig
            if (gissning < 1 || gissning > 100) {
                System.out.println("Fel: talet måste vara mellan 1 och 100.");
            }
            // Gissning är giltig
            else if (gissning < tal) {
                System.out.println("För lågt!");
            } else if (gissning > tal) {
                System.out.println("För högt!");
            } else {
                System.out.println("Rätt! Grattis!");
            }
        }

        scanner.close();
    }
}




//Skriv ett "Gissa talet"-spel där datorn väljer ett slumpmässigt tal mellan 1 och 100,
// och användaren får gissa vilket tal det är.
// Programmet ska ge feedback om gissningen är för hög eller för låg.
// Användaren gissar tills den har gissat rätt tal.