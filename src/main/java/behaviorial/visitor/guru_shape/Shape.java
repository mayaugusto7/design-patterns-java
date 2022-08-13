package behaviorial.visitor.guru_shape;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
