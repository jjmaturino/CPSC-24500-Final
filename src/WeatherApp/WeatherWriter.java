import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WeatherWriter {

    /**
    @author: Juan Maturino
    @return : void
    @param : Weather ArrayList
            <p>writes current Weather data to screen</p>
     */
    public static String writeWeatherToScreen(ArrayList<Weather> weather) {
        String formattedWeather = "\t\tCURRENT WEATHER\n\t\t_______________\n\n";

        for (Weather wr : weather) { formattedWeather += wr.toString();        }

        return formattedWeather;

    }


    /***
     * @author: Juan Maturino
     * @return : Boolean
     * @param : Weather object and filename
     * @param filename
     */
    public static boolean writeWeatherToTextFile(ArrayList<Weather> weather, File filename) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            pw.println("\t\tCURRENT WEATHER\n\t\t_______________\n\n");
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
      * @param : Weather objects and filename
      <p>writes weather data to JSON format</p>
     * @param filename
     */
    public static boolean writeWeatherToJSON(ArrayList<Weather> weather, File filename) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            JSONArray array = new JSONArray();
            JSONObject obj;

            for (Weather cWeather : weather) {
                // creates Current Weather json Object
                obj = new JSONObject();
                obj.put("Location", cWeather.getLocationDescription());
                obj.put("cDescription", cWeather.getcDescription());
                obj.put("cFahrenheit", cWeather.getcFahrenheit());
                obj.put("cCelsius", cWeather.getcCelsius());
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
