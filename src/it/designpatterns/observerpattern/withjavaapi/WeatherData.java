package it.designpatterns.observerpattern.withjavaapi;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 12/01/2017.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() { }


    public void measurementsChanged() {
        setChanged(); // indica che lo stato e' cambiato e deve aggiornare tutto
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
// other WeatherData methods here
}
