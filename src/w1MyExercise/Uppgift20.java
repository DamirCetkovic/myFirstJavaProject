package w1MyExercise;

public class Uppgift20 {
    public static void main(String[] args) {
        int tal = 19;

        if (tal >=0) {
            if (tal <=9) {
                int kvadrat = tal * tal;
                System.out.println("Kvadraten av talet är: " + kvadrat);
            } else {
                System.out.println("Fel: talet måste vara mellan 0 och 9!");
            }
        } else {
            System.out.println("Fel: talet måste vara mellan 0 och 9!");
        }

    }
}
