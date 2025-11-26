package ecUtbildningTomas.W3Damir;

public class Dog {
    // Attribut till namn och rasen
    private String name;
    private String breed;
    private int age;

    // Konstruktör
    public Dog(String name,String breed) {
        this.name = name;
        this.breed = breed;
    }
    // Metod bark
    public void bark() {
        System.out.println("Voff!");
    }
    public void updateAge(int age) {
        this.age = age;
    }
    public int getHumanAge() {
        return 7 * age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}


//13. 	Skapa en klass Dog:
//Konstruktorn ska ta in namnet och rasen på hunden. Skapa en metod bark som skriver ut ”Voff!".
// Skapa ett Dog-objekt i main och låt det skälla.
//
//14. Utöka Dog:
//Lägg till ett attribut age för hundens ålder. Skapa en metod som gör att du kan uppdatera hundens ålder.
//Skapa en metod getHumanAge som returnerar hundens ålder omvandlad till människoår (multiplicera med 7).
//Testa metoden i main-metoden.