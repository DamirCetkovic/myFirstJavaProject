package oop;

import java.util.Scanner;

public class OrdSpelMain {
    public static void main(String[] args) {


        OrdSpel spel1 = new OrdSpel("hund");
        OrdSpel spel2 = new OrdSpel("katt");
        OrdSpel spel3 = new OrdSpel("hus");

        Scanner scan = new Scanner(System.in);

        int poang = 0;

        System.out.println("Skriv ordet:");
        String svar1 = scan.nextLine();
        //spel1.kontrolleraSvar(svar1);
        if (svar1.equals("hund")) {
            System.out.println("Du skrev rätt!");
            poang = poang + 1;
        } else {
            System.out.println("Fel!");
        }

        System.out.println("Skriv andra ordet:");
        String svar2 = scan.nextLine();
        //spel2.kontrolleraSvar(svar2);
        if (svar2.equals("katt")) {
            System.out.println("Du skrev rätt!");
            poang = poang + 1;
        } else {
            System.out.println("Fel!");
        }


        System.out.println("Skriv tredje ordet:");
        String svar3 = scan.nextLine();
        //spel3.kontrolleraSvar(svar3);
        if (svar2.equals("hus")) {
            System.out.println("Du skrev rätt!");
            poang = poang + 1;
        } else {
            System.out.println("Fel!");
        }
        // Resultat
        System.out.println("Du fick totalt " + poang + " poäng!");
    }
}
