import java.util.*;
public class Lexicographically{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first String.");
        String s1 = s.nextLine();
        System.out.println("Enter the second String.");
        String s2 = s.nextLine();
        int result = s1.compareToIgnoreCase(s2);
        if(result == 0){
            System.out.println("Both are numerically same");
        } else if (result > 0){
            System.out.println("First String will come Ahead.");
        } else {
            System.out.println("Second String will come Ahead.");
        }
    }
}