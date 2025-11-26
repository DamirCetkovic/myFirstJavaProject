package w1MyExercise;
import java.util.Scanner;

public class Uppgift46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int summa = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Skriv tal nummer " + i + ": ");
            int tal = input.nextInt();
            summa += tal;
        }

            System.out.println("Summan av de 20 talen är " + summa);

            input.close();

    }
}
