import java.util.*;
public class CubeRoot{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = s.nextDouble();
        System.out.println("The cube root of the no. is: "+Math.cbrt(a));
    }
}