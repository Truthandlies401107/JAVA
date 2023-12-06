public class distance {
    private int feet;
    private int inches;
    public distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
    public void convertToCentimeters() {
        double totalInches = feet * 12 + inches;
        double centimeters = totalInches * 2.54;
        System.out.printf("Total distance: %.2f centimeters%n", centimeters);
    }
    public static void main(String[] args) {
        distance distanceObj = new distance(5, 8);
        distanceObj.convertToCentimeters();
    }
}
