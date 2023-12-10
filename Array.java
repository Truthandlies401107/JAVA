package JAVA;

import java.util.Scanner;
public class Array
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        int i, j, l, min = 0;
        System.out.println("Enter the arays: ");
        for( i =0; i<5; i++){
            a[i] = s.nextInt();
        }
        for( i =0; i<5; i++){
            min = i;
            for (j = i+1; j< 5; j++){
                if (a[j] < a[min])
                min = j;
            }
            l = a[min];
            a[min] = a[i];
            a[i] = l;
        }
        System.out.println("The sorted array are: ");
        for( i =0; i<5; i++){
            System.out.print(" "+a[i]);
        }
    }
}
