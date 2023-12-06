import java.util.Scanner;
public class HighestLowestScorers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marksArray = new int[50];
        for (int i = 0; i < 50; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marksArray[i] = scanner.nextInt();
        }
        int highestMarks = findHighestScorer(marksArray);
        int lowestMarks = findLowestScorer(marksArray);
        System.out.println("Highest scorer scored " + highestMarks + " marks.");
        System.out.println("Lowest scorer scored " + lowestMarks + " marks.");
        scanner.close();
    }
    private static int findHighestScorer(int[] marksArray) {
        int highest = marksArray[0];
        for (int marks : marksArray) {
            if (marks > highest) {
                highest = marks;
            }
        }
        return highest;
    }
    private static int findLowestScorer(int[] marksArray) {
        int lowest = marksArray[0];
        for (int marks : marksArray) {
            if (marks < lowest) {
                lowest = marks;
            }
        }
        return lowest;
    }
}
