package it.designpatterns.observerpattern.withoutjavapi;

/**
 * Created by Administrator on 12/01/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}