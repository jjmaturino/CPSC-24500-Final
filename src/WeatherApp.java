import java.util.ArrayList;
import java.util.Scanner;



public class WeatherApp {

    public static void main(String[] args){
        System.out.print("Enter the url: ");
        Scanner sc = new Scanner(System.in);
        String addr = sc.nextLine();

        ArrayList<Weather> currentWeather = WeatherReader.getWeatherList(addr);

        WeatherWriter.writeWeatherToTextFile(currentWeather, "testJ.json");
    }
}
