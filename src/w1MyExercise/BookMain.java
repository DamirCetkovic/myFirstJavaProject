package w1MyExercise;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "Ja" ;

        while (answer.equalsIgnoreCase("Ja")) {
            System.out.println("Skriv namn på boken: ");
            String title = scan.nextLine();

            System.out.println("Skriv nam på författaren: ");
            String author = scan.nextLine();

            System.out.println("Skriv antal sidor: ");
            int pages = scan.nextInt();
            scan.nextLine();


        /*System.out.println("Skriv namn  på boken: ");
        String title = scan.nextLine();

        System.out.println("Skriv namn på author: ");
        String author = scan.nextLine();

        System.out.println("Skriv vilken sida: ");
        int pages = scan.nextInt();*/

            Book myBook = new Book(title, author, pages);
            myBook.getSummary();

            boolean isLongBook;
            if (myBook.isLongBook()) {
                System.out.println("Boken är lång ");
            }


            System.out.println("Vill du skriva in en till bok? (Ja/Nej)");
            answer = scan.nextLine();

        }


    scan.close();
        //System.out.println("Tack!");


    }
}
