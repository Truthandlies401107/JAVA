import java.util.Scanner;
public class Student {
    private int rollNo;
    private String name;
    private int marks1;
    private int marks2;
    private double average;
    private void calculateAverage() {
        average = (marks1 + marks2) / 2.0;
    }
    public void set() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No (2 digits): ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Name (up to 20 characters): ");
        name = scanner.nextLine();
        System.out.print("Enter Marks for Test 1: ");
        marks1 = scanner.nextInt();
        System.out.print("Enter Marks for Test 2: ");
        marks2 = scanner.nextInt();
        calculateAverage();
    }
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks for Test 1: " + marks1);
        System.out.println("Marks for Test 2: " + marks2);
        System.out.println("Average Marks: " + average);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.set();
        student.display();
    }
}
