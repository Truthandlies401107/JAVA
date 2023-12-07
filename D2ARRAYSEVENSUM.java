//Write a program in java to input 2D array of size n*m perform the following task
// print the array in matrix form n*m
// compute and print the sum of elements of each row;

import java.util.*;
public class D2ARRAYSEVENSUM{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();
        System.out.println("Enter the value of m: ");
        int m = s.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the rows and column: ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println();
        System.out.println("The 2D arrays are: ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        System.out.println("Now the sum of rows: ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}