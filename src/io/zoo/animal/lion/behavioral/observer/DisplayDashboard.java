package io.zoo.animal.lion.behavioral.observer;

public class DisplayDashboard implements Observer {

    private WeatherData weatherData;

    public DisplayDashboard(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {

    }
}
