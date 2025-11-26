package ecUtbildningTomas;

import java.util.Scanner;

public class CalculatorUppgiftMain {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // skapar mitt Scanner objekt
        System.out.println("Skriv in tal1: "); // vill ha input på samma rad därför bara print och ej println
        int tal1 = myScanner.nextInt();
        System.out.println("Skriv in tal2: ");
        int tal2 = myScanner.nextInt();


        CalculatorUppgift calc = new CalculatorUppgift(tal1, tal2);
        int summa = calc.addition();
        System.out.println("Summan är: " + summa);
        System.out.println("Differensen är: " + calc.subtraktion());
        System.out.println("Kvoten är: " + calc.division());
        System.out.println("Produktion är: " + calc.multiplikation());

    }
}