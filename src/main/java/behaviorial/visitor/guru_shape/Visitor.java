package behaviorial.visitor.guru_shape;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundShape(CompoundShape compoundShape);
}
