import java.util.*;
public class LinearSearch {
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            int a[] = new int[10];
            System.out.println("Enter arrays: ");
             for(int i =0; i<10; i++){
                System.out.println("Enter array no. "+(i+1)+": ");
                a[i] = s.nextInt();
             }
             System.out.println("The arrays are: ");
             for(int i =0; i<10; i++){
                System.out.print(" "+a[i]);
             }
                System.out.println();
                //Now 
                System.out.println("Enter the number to search: ");
                int d = s.nextInt();
                for(int i=0; i<10; i++){
                    if(a[i]==d){
                        System.out.println("The number "+d+" is available at positon "+(i)+" on the index.");
                    }
                }
        }
    }
}
