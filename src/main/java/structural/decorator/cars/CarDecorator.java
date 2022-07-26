package structural.decorator.cars;

public class CarDecorator implements Car {

    private final Car car; //wrappee denominada composição recursiva

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
