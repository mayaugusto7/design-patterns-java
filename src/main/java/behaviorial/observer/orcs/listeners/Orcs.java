package behaviorial.observer.orcs.listeners;

import behaviorial.observer.orcs.weather.WeatherType;
import behaviorial.observer.orcs.publisher.WeatherObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Orcs implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
      log.info("The orcs are facing " + currentWeather.getDescription() + " weather now");
    }
}
