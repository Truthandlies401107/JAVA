import java.util.*;
public class Factorial_Number{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int a = s.nextInt();
        long f = 1;
        for(int i = 1; i<= a ; i++){
            f = f*i;
        }
        System.out.println("The factorial of no. "+a+" is: "+f);
    }
}