import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

public class TestShapeCollection {
    @Test
    public void testEmptyCollection() {
        // Given: New shape collection.
        ShapeCollection Collection = new ShapeCollection();
        
        // When: emptyCollection.
        int NumberOfShapes = Collection.getNumberOfShapes();
        double TotalArea = Collection.getTotalArea();
        
        // Then: Amount of shapes = 0.
        // Total Area = 0
        assertEquals(0, NumberOfShapes);
        assertEquals(0.0, TotalArea);
    }

    @Test
    public void testSingleRectangle() {
        // Given: New shape collection and rectangle.
        ShapeCollection Collection = new ShapeCollection();
        Rectangle Rectangle = new Rectangle(2, 10);
        
        // When: Add Rectangle to ShapeCollection.
        Collection.addShape(Rectangle);
        
        // Then: Amount of shapes = 1.
        // Total Area = 20
        assertEquals(1, Collection.getNumberOfShapes());
        assertEquals(20.0, Collection.getTotalArea());
    }

    @Test
    public void testRectangleAndCircle() {
        // Given: New shape collection and rectangle and circle.
        ShapeCollection Collection = new ShapeCollection();
        Rectangle Rectangle = new Rectangle(5, 10);
        Circle Circle = new Circle(5);
        
        // When: Add Rectangle and Circle to ShapeCollection
        Collection.addShape(Rectangle);
        Collection.addShape(Circle);
        
        // Then: Amount of shapes = 2.
        // Areas should be correct
        assertEquals(2, Collection.getNumberOfShapes());
        assertEquals(Rectangle.getArea() + Circle.getArea(), Collection.getTotalArea());
    }

    
    @Test
    public void testSingleCircle(){
        // Given: New shape collection and circle.
        ShapeCollection Collection = new ShapeCollection();
        Circle circle = new Circle(10);

        // When: Add Circle to ShapeCollection.
        Collection.addShape(circle);

        // Then: Amound of shapes = 1.
        // Total Area = circle area
        assertEquals(1, Collection.getNumberOfShapes());
        assertEquals(circle.getArea(), Collection.getTotalArea());
    }

    @Test
    public void testSingleTriangle(){
        // Given: New shape collection and triangle
        ShapeCollection Collection = new ShapeCollection();
        Triangle triangle = new Triangle(5, 2);

        // When: Add triangle to ShapeCollection
        Collection.addShape(triangle);

        // Then: Amound of shapes = 1.
        // Total Area = 5
        assertEquals(1, Collection.getNumberOfShapes());
        assertEquals(5, Collection.getTotalArea());
    }

    @Test
    public void testOneOfEach(){
        // Given: New shape collection and all shapes
        ShapeCollection Collection = new ShapeCollection();
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(5, 10);
        Circle circle = new Circle(5);

        // When: add all shapes to shape collection
        Collection.addShape(circle);
        Collection.addShape(triangle);
        Collection.addShape(rectangle);
        Collection.addShape(square);

        // Then: Amound of shapes = 4,
        // Total Area = all areas together.
        assertEquals(4, Collection.getNumberOfShapes());
        assertEquals(square.getArea() + rectangle.getArea() + triangle.getArea() + circle.getArea(), Collection.getTotalArea());
    }
}
