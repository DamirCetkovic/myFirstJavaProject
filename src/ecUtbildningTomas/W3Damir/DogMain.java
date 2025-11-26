package ecUtbildningTomas.W3Damir;

public class DogMain {
    public static void main(String[] args) {
        // Objekt av Dog-klassen med namn och ras
        Dog dog1 = new Dog("Rex","Labrador");
        dog1.updateAge(3);

        System.out.println("Hundens älder i människoår: " + dog1.getHumanAge());

        // Låt hunden skälla
        dog1.bark();

    }
}
