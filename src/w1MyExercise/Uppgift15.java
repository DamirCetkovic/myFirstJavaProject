package w1MyExercise;

public class Uppgift15 {
    public static void main(String[] args) {

        /*Skapa ett program som sparar två tal i variabler och avgör och skriver ut om det första
        talet är jämnt delbart med det andra talet*/

        int tal1 = 20;
        int tal2 = 2;

        if (tal1 % tal2 == 0) {
            System.out.println("Talen är jämnt delbara");
        } else {
            System.out.println("Talen är inte jämnt delbara");
        }
    }
}
