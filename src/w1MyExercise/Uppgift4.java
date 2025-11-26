package w1MyExercise;

public class Uppgift4 {
    public static void main(String[] args) {

        //definera tre tal
        int tal1 = 5;
        int tal2 = 7;
        int tal3 = 11;

        //Beräkna summan
        int summa = tal1 + tal2 +tal3;

        //Beräkna medelvärdet (double för decimaler)
        double medel = summa / 3.0
                ;

        //Skriv ut resultat
        System.out.println("Summan är: " + summa);
        System.out.println("Medelvärdet är: " + medel);
    }
}
