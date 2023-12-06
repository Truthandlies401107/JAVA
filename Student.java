import java.util.*;
public class Student {
    int a,b,c,avg,per;
    String rollon, name;
    char ch;
    Scanner s = new Scanner(System.in);
    void take1(){
        System.out.println("Enter the roll on.");
        rollon = s.next();
    }
    void take2(){
        System.out.println("Enter the student name: ");
        name = s.next();
    }
    void take3(){
       System.out.println("Enter the marks1 :");
       a = s.nextInt();
       System.out.println("Enter the marks2 :");
       b = s.nextInt();
       System.out.println("Enter the marks3 :");
       c = s.nextInt();
       //Now
       avg = (a+b+c)/3; 
    }
    void take4(){
        //Take total marks for each subject 100.
        per = (int) (((float) (a + b + c) / 300) * 100.0);
    }
    void take5(){
        System.out.println("Enter your grades: ");
        ch = s.next().charAt(0);
    }
    void display(){
        System.out.println("The name of the student: "+name);
        System.out.println("The rollon of the student: "+rollon);
        System.out.println("The average marks: "+avg);
        System.out.println("The Percantage got: "+per);
        System.out.println("Your grade: "+ch);
    }
    public static void main(String args[]){
        Student obj = new Student();
        obj.take1();
        obj.take2();
        obj.take3();
        obj.take4();
        obj.take5();
        obj.display();
    }
}
