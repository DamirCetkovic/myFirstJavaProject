package w1MyExercise;

public class Uppgift19 {
    public static void main(String[] args) {
        double timlön = 200;
        double arbetstimmar = 90;

        if (arbetstimmar > 40) {
            double övertidstimmar = arbetstimmar - 40;
            double övertidslön = övertidstimmar * (timlön * 1.5);
            double totalLön = (40 * timlön) + övertidslön;
            System.out.println("Du har arbetat " + övertidstimmar + " övertidstimmar.");
            System.out.println("Din totala veckolön är: " + totalLön + " kr.");
        } else {
            double totalLön = arbetstimmar * timlön;
            System.out.println("Ingen övertid. Din veckolön är: " + totalLön + " kr.");
        }

    }
}
