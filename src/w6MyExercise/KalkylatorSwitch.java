package w6MyExercise;
import java.util.Scanner;

public class KalkylatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange första talet: ");
        double tal1 = scanner.nextDouble();

        System.out.print("Ange andra talet: ");
        double tal2 = scanner.nextDouble();

        scanner.nextLine(); // rensa buffern

        System.out.print("Ange operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        switch(operation) {
            case "+":
                System.out.println("Resultat: " + (tal1 + tal2));
                break;
            case "-":
                System.out.println("Resultat: " + (tal1 - tal2));
                break;
            case "*":
                System.out.println("Resultat: " + (tal1 * tal2));
                break;
            case "/":
                if(tal2 != 0) {
                    System.out.println("Resultat: " + (tal1 / tal2));
                } else {
                    System.out.println("Fel: Division med noll");
                }
                break;
            default:
                System.out.println("Ogiltig operation");
        }

        scanner.close();
    }
}
//Skapa en enkel kalkylator som tar emot två tal och en operation
// (addition, subtraktion, multiplikation, division) från användaren.
// Använd en switch-sats för att bestämma vilken operation som ska utföras baserat på användarens input
