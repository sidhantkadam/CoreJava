package DesignPatterns.Behevioural;

import java.util.ArrayList;
import java.util.List;

    /*
    Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects.
    When one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.
    It primarily deals with the interaction and communication between objects, specifically focusing on how objects
    behave in response to changes in the state of other objects.
    */

//Create Subject Interface
interface Subject {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyUpdate();
}

//Create Concrete class for Subject
class WeatherStation implements Subject {

    public String weather;

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyUpdate() {
        for (Observer observer1 : observerList) {
            observer1.update(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyUpdate();
    }
}

//Create Interface for Observer
interface Observer {
    void update(String weather);
}

//Concrete Observer 1
class PhoneDisplay implements Observer {

    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("Phone Display : Weather updated" + " " + weather);
    }
}

//Concrete Observer 2
class TVDisplay implements Observer {

    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("TV Display: Weather updated" + " " + weather);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        //Simulating weather change
        weatherStation.setWeather("Sunny");
    }
}
