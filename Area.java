package JAVA;

public class Area {
    double length, breath, heigth, radius, base;
    double pi = 3.14;
    double rectangle, circle, triangle;
    Area(){
        length = 41;
        breath = 54;
        heigth = 23; 
        radius = 7;
        base = 12;
        rectangle = length *breath;
        circle = pi*radius*radius;
        triangle = 0.5 * heigth * base;
    }
    Area(double rectangle1, double circle1, double triangle1 ){
        rectangle = rectangle1;
        circle = circle1;
        triangle = triangle1;
    }
    void display(){
        System.out.println("The area of the rectangle is: "+rectangle);
        System.out.println("The area of the circle is: "+circle);
        System.out.println("The area of the triangle is: "+triangle);
    }
    public static void main(String args[]){
        Area obj = new Area();
        obj.display();
    }
}
