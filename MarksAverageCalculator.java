import java.util.Scanner;
public class MarksAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marksArray = new int[50];
        for (int i = 0; i < 50; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marksArray[i] = scanner.nextInt();
        }
        double averageMarks = calculateAverage(marksArray);
        System.out.println("Average marks of the 50 students: " + averageMarks);
        scanner.close();
    }
    static double calculateAverage(int[] marksArray) {
        int sum = 0;
        for (int marks : marksArray) {
            sum += marks;
        }
        return (double) sum / marksArray.length;
    }
}
