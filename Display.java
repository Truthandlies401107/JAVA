import java.util.Scanner;
public class Display
{
    double f;
    double c;
    public void Convert(double c) {
        f = 1.8 * c + 32.0;
    }
    public void display(){
        System.out.println("Temperature in Celcius: "+c);
        
    }
}