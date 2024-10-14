public class Triangle implements Shape2D {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getWidth() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
       double area = (base*height)/2;
        
    return area;
    }
}