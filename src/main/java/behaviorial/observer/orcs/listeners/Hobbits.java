package behaviorial.observer.orcs.listeners;

import behaviorial.observer.orcs.weather.WeatherType;
import behaviorial.observer.orcs.publisher.WeatherObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
//        switch (currentWeather) {
//            log.info("The hobbits are facing weather now");
//        }
    }
}
