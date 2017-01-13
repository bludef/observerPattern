package it.designpatterns.observerpattern.withjavaapi;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 12/01/2017.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    Observable observable; // subjcet
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();


        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
    }
}
