package ecUtbildningTomas.W3Damir;

public class WeatherReportMain {
    public static void main(String[] args) {
        WeatherReport report = new WeatherReport(25.5, "Sunny");
        System.out.println("Weather description: " + report.getDescription());
    }
}
