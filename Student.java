package JAVA;

import java.util.Scanner;
public class Student {
    String name = "Prabhat";
    int age = 5;
    int m1 = 45, m2 = 98, m3 = 67;
    int maximum;
    double average;
    void student1(String name, int age, int m1, int m2, int m3) {
        name = name;
        age = age;
        m1 = m1;
        m2 = m2;
        m3 = m3;
    }
    void Average() {
        average = (m1 + m2 + m3) / 3.0;
    }
    void Maximum() {
        maximum = Math.max(m1, Math.max(m2, m3));
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks in three subjects: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
    }
    public static void main(String args[]){
        Student obj = new Student();
        obj.Average();
        obj.Maximum();
        obj.display();
    }
}
