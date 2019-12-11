import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WeatherWriter {

    /**
    @author: Juan Maturino
    @return : void
    @param : Weather
            <p>writes current Weather data to screen</p>
     */
    public static void writeWeatherToScreen(Weather wr) {
        String formattedMember = String.format(
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
                        + "Last Update:             %-25s\n", wr.getLocationDescription(), wr.getcDescription(), wr.getcFahrenheit(), wr.getcCelsius(), wr.getcHumidity(), wr.getcWindSpeed(), wr.getcBarometer(), wr.getcDewpoint(), wr.getcVisibility(), wr.getcWindChill(), wr.getcLastUpdate());
        System.out.println(formattedMember);
    }


    /***
     * @author: Juan Maturino
     * @return : Boolean
     * @param : Weather object and filename
     * <p>writes weather data to text file in JSON format</p>
     */
    public static boolean writeWeatherToTextFile(ArrayList<Weather> weather, String filename) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));

            for (Weather w : weather) {
                pw.println(w);
            }


            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     @author: Juan Maturino
     @return : Boolean
     @param : Weather objects and filename
     <p>writes weather data to JSON format</p>
     */
    public static boolean writeWeatherToJSON(ArrayList<Weather> weather, String filename) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            JSONArray array = new JSONArray();
            JSONObject obj;

            for (Weather cWeather : weather) {
                // creates Current Weather json Object
                obj = new JSONObject();
                obj.put("Location", cWeather.getLocationDescription());
                obj.put("cDescription", cWeather.getcDescription());
                obj.put("cHigh", cWeather.getcFahrenheit());
                obj.put("cLow", cWeather.getcCelsius());
                obj.put("cHumidity", cWeather.getcHumidity());
                obj.put("cWindSpeed", cWeather.getcWindSpeed());
                obj.put("cBarometer", cWeather.getcBarometer());
                obj.put("cDewpoint", cWeather.getcDewpoint());
                obj.put("cVisibility", cWeather.getcVisibility());
                obj.put("cWindChill", cWeather.getcWindChill());
                obj.put("cLastUpdate", cWeather.getcLastUpdate());


                array.add(obj);

            }




            JSONObject weatherList = new JSONObject();
            weatherList.put("Weather", array);
            pw.println(weatherList.toJSONString());
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }


}
