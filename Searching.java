import java.util.*;
public class Searching{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = 0 , b = 9, c = 0; 
        int arrays[] = new int[10];
        System.out.println("Enter the arrays: ");
        for(int i =0; i<10; i++){
            System.out.println("The Array is: ");
            arrays[i] = s.nextInt();
        }
        System.out.println("Enter a no. to search: ");
        int ns = s.nextInt(); 
        while(a <= b){
            int m = (a+b)/2;
            if(ns == arrays[m]){
                    c = 1;
                    break;
                }
            }
        if (c == 1){
            System.out.println("The no. is availiable");
        }
                
        else
                System.out.println("The no. is not availiable");
            }
}
