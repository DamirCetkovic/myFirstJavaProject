package ecUtbildningTomas.W3Damir;

public class Lamp {
    // Attribute boolan isOn
    boolean isOn;

    public Lamp(boolean isOn) {
        this.isOn = isOn;
    }
    // Metoder turnOn och turnOff
    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}

//16. Skapa en klass Lamp:
//Konstruktorn ska ta in ett boolean-attribut isOn.
//Skapa metoder turnOn och turnOff för att slå på och av lampan.
//Skapa ett Lamp-objekt i main och växla mellan på och av.
