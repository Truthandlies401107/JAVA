import java.util.*;
public class Calculations{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of employee: ");
        String name = s.nextLine();
        System.out.println("Enter the basic Salary of employee: ");
        double basic_pay = s.nextDouble();
        double da = (basic_pay*25)/100;
        double hra = (basic_pay*15)/100;
        double ma = (basic_pay*10)/100;
        double pf = (basic_pay*12)/100;
        double np = basic_pay+da+hra+ma;
        double gp = np - pf;
        System.out.println("The total gross pay is: "+gp);
    }
}