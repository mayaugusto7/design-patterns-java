package behaviorial.visitor.army_units;

import java.util.Arrays;

public abstract class Unit {

    private final Unit[] children;

    protected Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }
}
