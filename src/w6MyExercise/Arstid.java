package w6MyExercise;

import java.util.Scanner;

public class Arstid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange en månad: ");
        String manad = scanner.nextLine().toLowerCase();

        switch(manad) {
            case "december":
            case "januari":
            case "februari":
                System.out.println("Vinter");
                break;
            case "mars":
            case "april":
            case "maj":
                System.out.println("Vår");
                break;
            case "juni":
            case "juli":
            case "augusti":
                System.out.println("Sommar");
                break;
            case "september":
            case "oktober":
            case "november":
                System.out.println("Höst");
                break;
            default:
                System.out.println("Fel: Ogiltig månad");
        }

        scanner.close();
    }
}

//Låt användaren ange en månad
// (exempelvis januari, februari etc.)
// och använd en switch-sats för att skriva ut vilken årstid det är.
