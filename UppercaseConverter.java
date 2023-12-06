import java.util.Scanner;
public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput = scanner.nextLine();
        String uppercaseWord = userInput.toUpperCase();
        System.out.println("Uppercase version: " + uppercaseWord);
    }
}
