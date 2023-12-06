import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String a[] = {"apple", "cat", "dog", "bat"};
            int l = a.length;
            System.out.println("Enter a string to search.");
            String c = s.next();
            boolean b = false;
            for (int i = 0; i < l; i++) {
                if (c == a[i]) {
                    b = true;
                    break;  // Once found, no need to continue searching
                }
            }
            if (b) {
                System.out.println("The string is available.");
            } else {
                System.out.println("The string is not available.");
            }
        }
    }
}