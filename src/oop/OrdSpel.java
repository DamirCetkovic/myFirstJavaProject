package oop;

public class OrdSpel {
    // Felt som sparar ordet
    private String ord;

    // Konstruktor som tar emot ordet
    public OrdSpel(String ord) {
        this.ord = ord;
    }

    // Metod som kontrollerar användarens svar
    public void kontrolleraSvar(String svar) {
        if (svar.equals(ord)) {
            System.out.println("Du skrev rätt!");
        } else {
            System.out.println("Du skrev fel, prova igen.");
        }
    }


}


