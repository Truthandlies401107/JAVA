package JAVA;

import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        int sum;
        int a,b;
        int ch;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Addition");
            System.out.println("2. Subraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("Your choice is: ");
            ch = s.nextInt();
            System.out.println("Enter the first number: ");
            a = s.nextInt();
            System.out.println("Enter the second number: ");
            b = s.nextInt();
        }
        if(ch == 1 ){
            sum = a+b;
            System.out.println("The sum of two number is: "+sum);
        } else if(ch == 2){
            sum = a-b;
            System.out.println("After subracting two numbers we get: "+sum);
        } else if(ch == 3){
            sum = a*b;
            System.out.println("The product of two numbers: "+sum);
        } else if(ch == 4){
            sum = a/b;
            System.out.println("After dividing two numbers: "+sum);
        } else if(ch == 5){
            sum = a%b;
            System.out.println("The remainder is: "+sum);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
