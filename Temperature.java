class Temperature {
    static double convertToFahrenheit(double celsius) {
        return 1.8 * celsius + 32.0;
    }
}
class Display {
    static void displayFahrenheit(double celsiusTemperature) {
        double fahrenheitTemperature = Temperature.convertToFahrenheit(celsiusTemperature);
        System.out.println("The equivalent Fahrenheit temperature is: " + fahrenheitTemperature + " °F");
    }
}
class Main {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0;
        Display.displayFahrenheit(celsiusTemperature);
    }
}
