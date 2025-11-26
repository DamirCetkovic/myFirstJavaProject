package w6MyExercise;

import java.util.Scanner;

public class Veckodag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mata in en siffra (1-7): ");
        int dag = scanner.nextInt();

        switch(dag) {
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Fel: siffran måste vara 1-7");
        }

        scanner.close();
    }
}

//Skapa ett program där användaren matar in en siffra (1-7)
// och programmet använder en switch-sats för att skriva ut
// motsvarande dag i veckan (1 är Måndag, 2 är Tisdag, etc.).