package w1MyExercise;

public class Uppgift16 {
    public static void main(String[] args) {
         int antal = 7;
         double prisPerEnhet = 223.5;

         double summa = antal * prisPerEnhet;
        System.out.println("Summan är: " +summa+" kr");

         if(summa >= 1000) {
             System.out.println("Du får rabatt 10% för summan är över 1000 kr");
             System.out.println("Din rabatt är: " +summa  * 0.10+" kr");
             System.out.println("Du betalar: " + (summa - (summa * 0.10))+" kr");
         } else {
             System.out.println("Ingen rabatt under 1000 kr");
         }
    }

}
