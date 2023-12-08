import java.util.*;
public class SORTEDARRAY2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The Entered arrays are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i > 0; i--) {
            int p = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[p]) {  // Change the comparison condition here
                    p = j;
                }
            }
            int t = arr[p];
            arr[p] = arr[i];
            arr[i] = t;
        }
        System.out.println("\nThe sorted arrays in descending order are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
