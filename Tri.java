import java.util.Scanner;
public class Tri {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int a[] = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter array no. " + (i + 1));
                a[i] = s.nextInt();
            }
            System.out.print("The arrays are: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(a[i] + " ");
            }
            int x = a.length - 1;
            // Display the pattern
            for (int j = x; j >= 0; j--) {
                System.out.println();
                for (int i = 0; i < j; i++) {
                    System.out.print(a[i] + " ");
                }
            }
            for (int i = 0; i < x; i++) {
                a[i] = a[i + 1] + a[i];
            }
        }
    }
}
