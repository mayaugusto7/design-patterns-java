package creational.builders.refactoring_guru;

import creational.builders.refactoring_guru.components.Engine;
import creational.builders.refactoring_guru.components.GPSNavigator;
import creational.builders.refactoring_guru.components.Transmission;
import creational.builders.refactoring_guru.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
