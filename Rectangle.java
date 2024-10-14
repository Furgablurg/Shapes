public class Rectangle implements Shape2D {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        // TODO: Skriv klart den här funktionen.
        double area = width * height;
        return area;
    }
}