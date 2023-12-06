import java.util.Scanner;
public class distance2 {
    int meters ;
    int centimeters;
    public distance2(int meters, int centimeters) {
        meters = meters;
        centimeters = centimeters;
    }
    public void convertAndDisplay() {
        int totalCentimeters = meters * 100 + centimeters;
        double totalFeet = totalCentimeters / 30.48; 
        System.out.printf("Total distance in centimeters: %d cm%n", totalCentimeters);
        System.out.printf("Total distance in feet: %.2f feet%n", totalFeet);
    }
    public static void main(String[] args) {
        distance2 Obj = new distance2(4, 110);
        Obj.convertAndDisplay();
    }
}
