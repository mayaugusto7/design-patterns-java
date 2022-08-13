package behaviorial.visitor.guru_shape;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    private final int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundShape(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
