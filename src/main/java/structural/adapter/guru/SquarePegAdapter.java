package structural.adapter.guru;

public class SquarePegAdapter extends RoundPeg {

    // Class incompatible with RoundHole
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // Adapter run
    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
