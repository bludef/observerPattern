package it.designpatterns.observerpattern.withjavaapi;

/**
 * Created by Administrator on 12/01/2017.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
