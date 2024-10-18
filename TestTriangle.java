import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {
    @Test
    public void testSomeTriangle() {
        Triangle test1 = new Triangle(10, 15);
        double Width = test1.getWidth();
        assertTrue(10==Width);


        Triangle test2 = new Triangle(10, 15);
        double Height = test2.getHeight();
        assertTrue(15==Height);

        Triangle test3 = new Triangle(10, 15);
        double Area = test3.getArea();
        assertTrue(75==Area);

    




        // TODO: Skriv klart tester för en triangel.
        // Ta bort raden nedan innan du börjar.
        // Kom ihåg Given, When, Then och se till att
        // ALLA metoder i Triangle täcks av dina tester.
        
    }

    @Test
    public void testSomeOtherTriangle() {
        // TODO: Skriv klart tester för en annan triangel.
        // Ta bort raden nedan innan du börjar.
        Triangle test1 = new Triangle(500, 200);
        double Width = test1.getWidth();
        assertTrue(500==Width);


        Triangle test2 = new Triangle(500, 200);
        double Height = test2.getHeight();
        assertTrue(200==Height);

        Triangle test3 = new Triangle(500, 200);
        double Area = test3.getArea();
        assertTrue(50000==Area);
    }
}
