package ecUtbildningTomas.W3Damir;

public class WeatherReport {
    double temperature;
    String description;

    // Konstruktor tar in temperatur och beskrivning
    public WeatherReport(double temperature, String description){
        this.temperature = temperature;
        this.description= description;
    }
    // Metod getDescription
    public String getDescription() {
        return description;
    }
}

//18. Skapa en klass WeatherReport:
//Konstruktorn ska ta in temperatur och beskrivning (t.ex. "soligt", "regnigt").
//Skapa en metod getDescription som returnerar en beskrivning av vädret.
//Skapa ett WeatherReport-objekt i main och skriv ut väderbeskrivningen.
