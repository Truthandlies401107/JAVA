import java.util.Scanner;
public class StringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sample string: ");
        String inputString = scanner.nextLine();
        String replacedString = inputString.replaceAll("\\bBlue\\b", "Red");
        System.out.println("Original String: " + inputString);
        System.out.println("String after replacing 'Blue' with 'Red': " + replacedString);
    }
}
