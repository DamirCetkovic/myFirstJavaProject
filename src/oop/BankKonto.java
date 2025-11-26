package oop;

public class BankKonto {

    // Attribut (saldo är private för att skydda datan)
    private double saldo;

    // Konstruktor – bestämmer startvärdet
    public BankKonto(double startSaldo) {
        if (startSaldo >= 0) {
            this.saldo = startSaldo;
        } else {
            System.out.println("Fel: Startsaldo kan inte vara negativt!");
            this.saldo = 0;
        }
    }

    // Getter – ger tillbaka nuvarande saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter – ändrar hela saldot
    public void setSaldo(double nyttSaldo) {
        if (nyttSaldo >= 0) {
            this.saldo = nyttSaldo;
        } else {
            System.out.println("Fel: Saldo kan inte vara negativt!");
        }
    }

    // Lägger till pengar
    public void laggTill(double belopp) {
        if (belopp > 0) {
            this.saldo += belopp;
        } else {
            System.out.println("Fel: Beloppet måste vara positivt!");
        }
    }

    // Tar bort pengar (utan att gå under 0)
    public void taBort(double belopp) {
        if (belopp <= this.saldo) {
            this.saldo -= belopp;
        } else {
            System.out.println("Fel: Du har inte tillräckligt med pengar!");
        }
    }
}
