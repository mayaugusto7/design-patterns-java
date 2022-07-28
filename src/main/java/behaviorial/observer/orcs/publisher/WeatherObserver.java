package behaviorial.observer.orcs.publisher;

import behaviorial.observer.orcs.weather.WeatherType;

public interface WeatherObserver {

    void update(WeatherType currentWeather);
}
