package JAVA;

import java.util.Scanner;
public class OddorEven{
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = s.nextInt();
            if(num%2 == 0){
                System.out.println("The number is even.");
            }
            else {
                System.out.println("The number is odd.");
            }
        }
    }
}
