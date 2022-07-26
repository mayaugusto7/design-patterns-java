package structural.decorator.cars;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic Car.");
    }
}
