import java.util.*;
public class arrays_addsub{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int ar[] = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Enter the array number "+(i+1)+": ");
            ar[i] = s.nextInt();
        }
        System.out.println("All arrays are: ");
        for(int i = 0; i < 10; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i < 10; i++){
            if (ar[i]%2 == 0){
                sum = sum + ar[i];
            }
        }
        System.out.println("The sum of the even arrays is: "+sum);
        int product = 1;
        for(int i = 0; i < 10; i++){
            if (ar[i]%2 != 0){
                product = product * ar[i];
            }
        }
        System.out.println("The product of the odd arrays is: "+product);
    }
}
// Create a new class WAP to declare an array marks [] to store and display the marks of 10 students using direct 
// assignment method.