package oop;

public class BankKontoMain {
    public static void main(String[] args) {
        BankKonto mittKonto = new BankKonto(1000.0);

        System.out.println("Startsaldo: " + mittKonto.getSaldo());

        mittKonto.laggTill(500.0);
        System.out.println("Efter insättning: " + mittKonto.getSaldo());

        mittKonto.taBort(300.0);
        System.out.println("Efter uttag: " + mittKonto.getSaldo());

        mittKonto.taBort(5000.0);
        System.out.println("Efter försök till stort uttag: " + mittKonto.getSaldo());
    }
}


/* mittKonto.skrivUtSaldo();
        mittKonto.setSaldo(2000);
        mittKonto.skrivUtSaldo();


        mittKonto.laggTill(500.0);
        mittKonto.skrivUtSaldo();

        mittKonto.taBort(300.0);
        mittKonto.skrivUtSaldo();

        mittKonto.taBort(50.0);

 */