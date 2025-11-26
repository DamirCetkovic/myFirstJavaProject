package w1MyExercise;
import java.util.Scanner;

public class Uppgift47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hur många tal vill du summera? ");
        int antalTal = input.nextInt();

        int summa = 0;

        int i;
        for (i = 1; i <= antalTal; i++) {
        System.out.println("Skriv tal nummer " + i + ": ");
        int tal = input.nextInt();
        summa += tal;
    }

    System.out.println("Summan av de " + antalTal + " talen är: " + summa);

    input.close();
    }
}
