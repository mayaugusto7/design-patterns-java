package behaviorial.visitor.guru_shape;

public class JSONExportVisitor implements Visitor {

    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape: args) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "{\"id\":" + dot.getId() +
                "\"x\":" + dot.getX() +
                "\"y\":" + dot.getY() + "}";
    }

    @Override
    public String visitCircle(Circle circle) {
        return null;
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return null;
    }

    @Override
    public String visitCompoundShape(CompoundShape compoundShape) {
        return null;
    }
}
