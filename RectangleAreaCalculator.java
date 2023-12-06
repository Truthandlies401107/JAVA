class Rectangle {
    double length;
    double width;
    double area;
    public Rectangle(double length, double width) {
        length = length;
        width = width;
        area = length * width;
    }
    public double getArea() {
        return area;
    }
}
public class RectangleAreaCalculator {
    public static void main(String[] args) {
        double length = 5.0;
        double width = 8.0;
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is: " + rectangle.getArea());
    }
}
