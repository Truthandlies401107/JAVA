package JAVA;

import java.util.Scanner;
public class IorN{
    public static void main(String args[]){
        int ch, n, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Following are some choices: ");
        System.out.println("1. Normal Triangle ");
        System.out.println("2. Inverted Triangle");
        System.out.println("Enter your choice: ");
        ch = s.nextInt();
        System.out.println("Enter no. of rows: ");
        n = s.nextInt();
        if(ch==1){
            for(i =1; i<=n; i++){
                for(j =1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if(ch == 2){
            for(i =n; i>=1; i--){
                for(j =1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
             System.out.println("Invalid choice");
        }
    }
}
