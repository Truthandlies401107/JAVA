package JAVA;

import java.util.Scanner;

public class Length {
    public static void main(String args[]) {
        int ch;
        String a;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter your choice: ");
            ch = s.nextInt();
            s.nextLine(); // Consume the newline character
            System.out.println("Enter a String: ");
            a = s.nextLine();
        }
        if (ch == 1) {
            for (int i = 1; i <= a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(a.length() + " " + j + " ");
                }
                System.out.println();
            }
        } else if (ch == 2) {
            for (int i = a.length(); i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(a.length() + " " + j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}
