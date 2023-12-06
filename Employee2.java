public class Employee2 {
    int id;
    String name;
    double basic;
    double hra;
    double da;
    double pf;
    public Employee2() {
        basic = 0;
        hra = 0;
        da = 0;
        pf = 0;
    }
    public Employee2(int id, String name, double basic) {
        id = id;
        name = name;
        basic = basic;
        hra = 0.1 * basic;
        da = 0.55 * basic;
        pf = 1000;
    }
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
    }
    public static void main(String[] args) {
        Employee2 employee = new Employee2(1, "John Doe", 50000);
        employee.display();
    }
}