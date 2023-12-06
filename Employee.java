import java.util.Scanner;
public class Employee
{
    String name;
    float salary, HRA, total;
    void intial () {
        name = "Rajesh";
        salary = 500000;
    }
    void compute () {
        HRA = salary*50/100;
    }
    void totalize () {
        total = salary + HRA;
    }
    void display () {
        System.out.println("The name of Employee: "+name);
        System.out.println("The income of Employee: "+total);
    }
public static void main(String args[]) {
        Employee obj = new Employee();
        obj.intial();
        obj.compute();
        obj.totalize();
        obj.display();
    }
}


