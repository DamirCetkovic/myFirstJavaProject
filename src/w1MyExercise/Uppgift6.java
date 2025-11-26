package w1MyExercise;

public class Uppgift6 {
    public static void main(String[] args) {

        //Definera antal kronor
        int kr = 1242;

        //Omvandla till dollar och pund
        double dollar = kr / 6.0; // 1 dollar = 6 kr
        double pund = kr / 10.0; // 1 pund = 10 kr

        //Skriv ut resultaten
        System.out.println(kr + " svenska kronor blir: " + dollar + " dollar");
        System.out.println(kr + " svenska kronor blir: " + pund + " pund");


    }
}
