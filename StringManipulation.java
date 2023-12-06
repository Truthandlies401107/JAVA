import java.util.*;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase String: " + uppercaseString);
    }
    private static void printVowelsAndFrequency(String str) {
        Map<Character, Integer> vowelFrequency = new HashMap<>();
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        for (char vowel : vowels) {
            vowelFrequency.put(vowel, 0);
        }
        for (char ch : str.toCharArray()) {
            if (vowelFrequency.containsKey(ch)) {
                vowelFrequency.put(ch, vowelFrequency.get(ch) + 1);
            }
        }
        char a;
        System.out.println("Vowels and their frequency:");
        for (char vowel : vowels) {
            int frequency = vowelFrequency.get(vowel);
            if (frequency > 0) {
                System.out.println(vowel + ": " + frequency);
            }
        }
    }
}
