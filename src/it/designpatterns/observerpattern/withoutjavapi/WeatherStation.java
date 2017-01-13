package it.designpatterns.observerpattern.withoutjavapi;

/**
 * Created by Administrator on 12/01/2017.
 */
public class WeatherStation {
    public static void main (String[] args){
        // ---------- Subject -------------------
        WeatherData weatherData = new WeatherData();
        // -------- Observer ---------------------
        CurrentConditionsDisplay currentDisplay =  new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        // --------- operation ------------------
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("------------------------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("------------------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
