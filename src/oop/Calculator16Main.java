package oop;
import java.util.Scanner;

public class Calculator16Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in första talet:");
        double tal1 = scan.nextDouble();

        System.out.println("Skriv in andra talet:");
        double tal2 = scan.nextDouble();

        Calculator16 minKalkylator = new Calculator16(tal1, tal2);

        double summa = minKalkylator.addera();
        double diff = minKalkylator.subtrahera();
        double produkt = minKalkylator.multiplicera();
        double kvot = minKalkylator.dividera();

        System.out.println("Summan är: " + summa);
        System.out.println("Differensen är: " + diff);
        System.out.println("Produkten är: " + produkt);
        System.out.println("Kvoten är: " + kvot);

        /*  // (uppgrade) Andra kalkylatorn, som använder produkt och summa från första
        Calculator nyKalkylator = new Calculator(produkt, summa);

        double nySumma = nyKalkylator.addera();
        double nyProdukt = nyKalkylator.multiplicera();

        System.out.println("\nAndra kalkylatorn (med produkt & summa som nya tal):");
        System.out.println("Ny summa: " + nySumma);
        System.out.println("Ny produkt: " + nyProdukt);

        scan.close();
*/
    }
}
