import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class WeatherReader {

    /**
     * @author: Juan Maturino
     * @param: String
     * @return: Weather
     * <p>Returns Weather Object</p>
     */
    public static Weather getWeather(String fullData) {

        String[] weatherData = fullData.split("\t");

        return  new Weather(
                weatherData[0],
                weatherData[1],
                weatherData[2],
                weatherData[3],
                weatherData[4],
                weatherData[5],
                weatherData[6],
                weatherData[7],
                weatherData[8],
                weatherData[9],
                weatherData[10]);


    }


    /**
     * @author: Juan Maturino
     * @param: String
     * @return: ArrayList<Weather>
     *
     * <p>Returns an array list of weather objects</p>
     */
    public static ArrayList<Weather> getWeatherList(String url)
    {

        ArrayList<Weather> weatherData = new ArrayList<>();
        try {


            // uses jsoup to parse through html Line 52-58
            Document document = Jsoup.connect(url).get();


            Elements locationTitle = document.getElementsByClass("panel-title");
            Elements conditions = document.getElementsByClass("myforecast-current");
            Elements conditionsLg = document.getElementsByClass("myforecast-current-lrg");
            Elements conditionsSm = document.getElementsByClass("myforecast-current-sm");
            Element contentOfConditions = document.getElementById("current_conditions_detail");
            Elements currentConditions = contentOfConditions.getElementsByTag("td");


            // gets data from html tags line 62-73
            String locationDescription = locationTitle.get(1).text();
            String cDescription = conditions.get(0).text();
            String fahrenheit = conditionsLg.get(0).text();
            String celsius = conditionsSm.get(0).text();

            String cHumidity = currentConditions.get(1).text();
            String cWindSpeed = currentConditions.get(3).text();
            String cBarometer = currentConditions.get(5).text();
            String cDewpoint = currentConditions.get(7).text();
            String cVisibility = currentConditions.get(9).text();
            String cWindChill = currentConditions.get(11).text();
            String cLastUpdate = currentConditions.get(13).text();

            String fullData = locationDescription + "\t" + cDescription + "\t" + fahrenheit + "\t" + celsius + "\t";
            fullData = fullData + cHumidity  + "\t" + cWindSpeed  + "\t" + cBarometer  + "\t" + cDewpoint  + "\t" + cVisibility  + "\t";
            fullData = fullData + cWindChill + "\t" + cLastUpdate;

            // Adds current weather details into weather data array list
            weatherData.add(getWeather(fullData));

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

        return  weatherData;
    }
}
