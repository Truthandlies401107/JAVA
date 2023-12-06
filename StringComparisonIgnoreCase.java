import java.util.Scanner;
public class StringComparisonIgnoreCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        int result = str1.compareToIgnoreCase(str2);
        if (result == 0) {
            System.out.println("Both strings are lexicographically equal (ignoring case).");
        } else if (result < 0) {
            System.out.println("The first string comes before the second string lexicographically (ignoring case).");
        } else {
            System.out.println("The first string comes after the second string lexicographically (ignoring case).");
        }
    }
}
