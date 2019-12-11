import java.io.Serializable;

public class Weather implements Serializable {



    /**
     * @author: Juan Maturino
     * <p>Weather Class that holds website weather data</p>
     */
    private String locationDescription,
            cDescription, fahrenheit, celsius, cHumidity,
            cWindSpeed, cBarometer, cDewpoint,
            cVisibility, cWindChill, cLastUpdate;


    // Default Constructor
    public Weather() {
        this.locationDescription = "";
        this.cDescription = "";
        this.fahrenheit = "";
        this.celsius = "";
        this.cHumidity = "";
        this.cWindSpeed = "";
        this.cBarometer = "";
        this.cDewpoint = "";
        this.cVisibility = "";
        this.cWindChill = "";
        this.cLastUpdate = "";

    }

    public Weather(String locationDescription, String cDescription, String fahrenheit, String celsius, String cHumidity, String cWindSpeed, String cBarometer, String cDewpoint, String cVisibility, String cWindChill, String cLastUpdate) {
        this.locationDescription = locationDescription;
        this.cDescription = cDescription;
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
        this.cHumidity = cHumidity;
        this.cWindSpeed = cWindSpeed;
        this.cBarometer = cBarometer;
        this.cDewpoint = cDewpoint;
        this.cVisibility = cVisibility;
        this.cWindChill = cWindChill;
        this.cLastUpdate = cLastUpdate;

    }

    // ACCESSORS

    public String getLocationDescription() {
        return locationDescription;
    }

    public String getcDescription() {
        return cDescription;
    }

    public String getcFahrenheit() {
        return fahrenheit;
    }

    public String getcCelsius() {
        return celsius;
    }

    public String getcHumidity() {
        return cHumidity;
    }

    public String getcWindSpeed() {
        return cWindSpeed;
    }

    public String getcBarometer() {
        return cBarometer;
    }

    public String getcDewpoint() {
        return cDewpoint;
    }

    public String getcVisibility() {
        return cVisibility;
    }

    public String getcWindChill() {
        return cWindChill;
    }

    public String getcLastUpdate() {
        return cLastUpdate;
    }

    // MUTATORS


    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setcCelsius(String celsius) {
        this.celsius = celsius;
    }

    public void setcHumidity(String cHumidity) {
        this.cHumidity = cHumidity;
    }

    public void setcWindSpeed(String cWindSpeed) {
        this.cWindSpeed = cWindSpeed;
    }

    public void setcBarometer(String cBarometer) {
        this.cBarometer = cBarometer;
    }

    public void setcDewpoint(String cDewpoint) {
        this.cDewpoint = cDewpoint;
    }

    public void setcVisibility(String cVisibility) {
        this.cVisibility = cVisibility;
    }

    public void setcWindChill(String cWindChill) {
        this.cWindChill = cWindChill;
    }

    public void setcLastUpdate(String cLastUpdate) {
        this.cLastUpdate = cLastUpdate;
    }

    /**
     * <p>toString returns a string in json notation</p>
     *
     * @return: String
     */
    @Override
    public String toString() {
        return "Weather{" +
                "locationDescription='" + locationDescription + '\'' +
                ", cDescription='" + cDescription + '\'' +
                ", fahrenheit='" + fahrenheit + '\'' +
                ", celsius='" + celsius + '\'' +
                ", cHumidity='" + cHumidity + '\'' +
                ", cWindSpeed='" + cWindSpeed + '\'' +
                ", cBarometer='" + cBarometer + '\'' +
                ", cDewpoint='" + cDewpoint + '\'' +
                ", cVisibility='" + cVisibility + '\'' +
                ", cWindChill='" + cWindChill + '\'' +
                ", cLastUpdate='" + cLastUpdate + '\'' +
                '}';
    }
}
