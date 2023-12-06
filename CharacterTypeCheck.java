import java.util.Scanner;
public class CharacterTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        if (Character.isLetter(inputChar)) {
            if (Character.isUpperCase(inputChar)) {
                System.out.println("Entered character is an uppercase letter.");
            } else {
                System.out.println("Entered character is a lowercase letter.");
            }
        } else {
            if (Character.isDigit(inputChar)) {
                System.out.println("Entered character is a digit.");
            } else {
                System.out.println("Entered character is a special character.");
            }
        }
    }
}
