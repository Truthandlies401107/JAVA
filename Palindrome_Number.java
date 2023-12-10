import java.util.*;
public class Palindrome_Number{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to check if it is Palindrome or not. ");
        int a = s.nextInt();
        int b = a;
        int ra = 0;
        while(a != 0){
            ra = ra * 10 + a%10;
            a /= 10;
        }
        if (ra == b){
            System.out.println("The no. is Palindrome");
        }
        else {
            System.out.println("The no. is not Palindrome");
        }
    }
}