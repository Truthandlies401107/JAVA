import java.util.*;
public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rollNumbers = {101, 102, 103, 104, 105};
        int[] percentages = {60, 90, 85, 72, 89};
        sortData(rollNumbers, percentages);
        System.out.print("Enter Roll Number to search: ");
        int rollNumberToSearch = scanner.nextInt();
        int index = binarySearch(rollNumbers, rollNumberToSearch);
        if (index != -1) {
            System.out.println("Percentage for Roll Number " + rollNumberToSearch + ": " + percentages[index] + "%");
        } else {
            System.out.println("Roll Number not found");
        }
    }
    private static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    private static void sortData(int[] rollNumbers, int[] percentages) {
        int n = rollNumbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (rollNumbers[j] > rollNumbers[j + 1]) {
                    int tempRoll = rollNumbers[j];
                    rollNumbers[j] = rollNumbers[j + 1];
                    rollNumbers[j + 1] = tempRoll;
                    int tempPercentage = percentages[j];
                    percentages[j] = percentages[j + 1];
                    percentages[j + 1] = tempPercentage;
                }
            }
        }
    }
}
