package behaviorial.templatemethod.stealing;

public class HalflingThief {

    private StealingMethod method;

    public HalflingThief(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        this.method.steal();
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }
}
