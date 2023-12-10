package JAVA;

import java.util.*;
public class Arrays_OddorEven{
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            int a[] = new int[10];
            for(int i = 0; i<10; i++){
                System.out.println("Enter the "+(i+1)+" number:" );
                a[i] = s.nextInt();
            }
            System.out.println("The arrays are: ");
            for(int i = 0; i<10; i++){
                System.out.print(" "+a[i]);
            }
            int sum = 0;
            System.out.println();
            for(int i = 0; i<10; i++){
                if(a[i]%2 == 0){
                    sum = a[i]+sum;
                }
            }    
             System.out.println("The sum of the even no. is: "+sum);    
            int pro = 1;
            for(int i = 0; i<10; i++){
                if(a[i]%2 != 0){
                   pro = pro * a[i];
                }
            }
            System.out.println("The product of the odd no. is: "+pro);
        }
    }
}
