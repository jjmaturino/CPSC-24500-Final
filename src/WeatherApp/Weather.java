import java.io.Serializable;

public class Weather implements Serializable {



    /**
     * @author: Juan Maturino
     * <p>Weather Class that holds website weather data</p>
     */
    private String locationDescription,
            cDescription, cFahrenheit, cCelsius, cHumidity,
            cWindSpeed, cBarometer, cDewpoint,
            cVisibility, cWindChill, cLastUpdate;


    // Default Constructor
    public Weather() {
        this.locationDescription = "";
        this.cDescription = "";
        this.cFahrenheit = "";
        this.cCelsius = "";
        this.cHumidity = "";
        this.cWindSpeed = "";
        this.cBarometer = "";
        this.cDewpoint = "";
        this.cVisibility = "";
        this.cWindChill = "";
        this.cLastUpdate = "";

    }

    public Weather(String locationDescription, String cDescription, String cFahrenheit, String celsius, String cHumidity, String cWindSpeed, String cBarometer, String cDewpoint, String cVisibility, String cWindChill, String cLastUpdate) {
        this.locationDescription = locationDescription;
        this.cDescription = cDescription;
        this.cFahrenheit = cFahrenheit;
        this.cCelsius = celsius;
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
        return cFahrenheit;
    }

    public String getcCelsius() {
        return cCelsius;
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
        this.cFahrenheit = fahrenheit;
    }

    public void setcCelsius(String celsius) {
        this.cCelsius = celsius;
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
        return String.format(
                "Location Description:    %-25s\n"
                        + "Weather Description:     %-15s\n"
                        + "Fahrenheit:              %-25s\n"
                        + "Celsius:                %-25s\n"
                        + "Humidity:                %-25s\n"
                        + "Wind Speed:              %-25s\n"
                        + "Barometer:               %-25s\n"
                        + "Dewpoint:                %-25s\n"
                        + "Visibility:              %-25s\n"
                        + "Wind Chill:              %-25s\n"
                        + "Last Update:             %-25s\n\n", this.getLocationDescription(), this.getcDescription(), this.getcFahrenheit(), this.getcCelsius(), this.getcHumidity(), this.getcWindSpeed(), this.getcBarometer(), this.getcDewpoint(), this.getcVisibility(), this.getcWindChill(), this.getcLastUpdate());
    }
}
