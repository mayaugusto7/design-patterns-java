package behaviorial.observer.orcs.weather;

public enum WeatherType {
    SUNNY,
    RAINY,
    WINDY,
    COLD;

    WeatherType() {}

    @Override
    public String toString() {
        return "WeatherType{}";
    }

    public String getDescription() {
        var enumValues = WeatherType.values();

        return null;
    }
}
