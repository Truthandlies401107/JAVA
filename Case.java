import java.util.Scanner;
public class Case{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char inputChar = scanner.next().charAt(0);
        if (Character.isUpperCase(inputChar)) {
            System.out.println(inputChar + " is an Uppercase letter.");
        }
        else if (Character.isLowerCase(inputChar)) {
            System.out.println(inputChar + " is a Lowercase letter.");
        }
        else {
            System.out.println("Entered character is not a letter.");
        }
    }
}
