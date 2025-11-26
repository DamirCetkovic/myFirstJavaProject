package ecUtbildningTomas.W3Damir;

public class LampMain {
    public static void main(String[] args) {
         Lamp lamp1 = new Lamp(false); // Startar som avstängd
         lamp1.turnOn(); // Slår på lampan

        System.out.println("Lampan är på: " + lamp1.isOn());
    }
}
