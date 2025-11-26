package w1MyExercise;

public class Uppgift2 {

    public static void main(String[] args) {

       /*En försäljare har delvis prestationslön. Han får 8000 kr
         per månad i grundlön och 9% av försäljningssumman.
         Skapa ett program som beräknar lönesumman under en period.
        */

        int grundlön = 8000;
        int försäljningsumma = 100000;
        double provision = 0.09;

        double tota1lön = grundlön + provision;

        System.out.println();

        System.out.println("Provision är " +försäljningsumma * provision);
        System.out.println();
        System.out.println("Total lön är " +grundlön + provision);

    }
}
