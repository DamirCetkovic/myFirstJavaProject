package ecUtbildningTomas.W3Damir;

public class Item {
    String name;
    double price;

    // Kontruktor tar in namn och pris
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Metod som tar in procent och sänker priset
    public void applyDiscount(double percent){
        price = price - (price * percent / 100);
    }
}

//17. 	Skapa en klass Item:
//Konstruktorn ska ta in ett namn och ett pris.
//Skapa en metod applyDiscount som tar in en procent och sänker priset med den procentsatsen.
//Skapa ett Item-objekt i main, applicera en rabatt och visa det nya priset.
