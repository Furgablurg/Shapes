import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {
    private List<Shape2D> shapes = new ArrayList<>();

    public void addShape(Shape2D shape) {
        shapes.add(shape);
    }

    public int getNumberOfShapes() {
        return shapes.size();
    }

    public double getTotalArea() {
        // TODO: Skriv klart den här funktionen.
        double totalArea = 0.0;
        // Iterera över alla former och lägg till deras area till totalArea
        for (Shape2D shape : shapes) {
            totalArea += shape.getArea();
        }
        
        return totalArea;
    }
}