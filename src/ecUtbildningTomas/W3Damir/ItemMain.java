package ecUtbildningTomas.W3Damir;

public class ItemMain {
    public static void main(String[] args) {
        Item item1 = new Item("Car", 1000);

        System.out.println("Original price " + item1.price);

        item1.applyDiscount(20);

        System.out.println("Price after discount: " + item1.price);
    }
}
//17. 	Skapa en klass Item:
//Konstruktorn ska ta in ett namn och ett pris.
//Skapa en metod applyDiscount som tar in en procent och sänker priset med den procentsatsen.
//Skapa ett Item-objekt i main, applicera en rabatt och visa det nya priset