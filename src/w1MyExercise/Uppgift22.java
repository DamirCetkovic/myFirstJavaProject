package w1MyExercise;

public class Uppgift22 {
    public static void main(String[] args) {
        int tal = 7;

        if (tal < 0) {
            System.out.println("Tal är mindre 0.");
        } else if (tal > 9) {
            System.out.println("Talet är större än 9.");
        } else if (tal == 5) {
            System.out.println("Talet får inte vara 5.");
        } else {
            System.out.println("Talet är mellan 0 och 9, men inte 5.");
        }


    }
}
