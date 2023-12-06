import java.util.Scanner;
public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter space-separated numbers: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        printPattern(numbers);
    }
    private static void printPattern(String[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(numbers[i]);
            System.out.println(num);
            int nextNum = num + i + 1;
            while (nextNum <= (num * 2) - 1) {
                System.out.print(nextNum);
                nextNum += i + 1;
            }
        }
    }
}