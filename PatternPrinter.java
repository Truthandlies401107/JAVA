
    import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter space-separated numbers: ");
            String input = s.nextLine();
            String[] numbers = input.split(" ");

            printPattern(numbers);
        }
    }
    private static void printPattern(String[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(numbers[i]);
            System.out.print(num);

            int nextNum = num + i + 1;
            while (nextNum <= (num * 2) - 1) {
                System.out.print(" "+nextNum);
                nextNum += i + 1;
            }
            System.out.println();

        }
    }
}
