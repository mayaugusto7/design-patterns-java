package structural.adapter.shapes;

import structural.adapter.shapes.adapters.TwoWaysAdapter;
import structural.adapter.shapes.twoadap.ShapeType;

public class TwoWaysAdapterMain {

    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new TwoWaysAdapter(ShapeType.RECTANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.CIRCLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.TRIANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.RHOMBUS));

        System.out.println("Drawing...");
        drawing.draw();

        System.out.println("Resizing...");
        drawing.resize();
    }
}
