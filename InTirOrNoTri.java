package JAVA;

import java.util.Scanner;
public class InTirOrNoTri{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i, j;
        System.out.println("Enter choice no 1 or 2: ");
        int ch = s.nextInt();
        System.out.println("Enter the no. of the rows: ");
        int n = s.nextInt();
        if (ch == 1){
            for(i =1; i<=n; i++){
                for(j = 1; j<=i; j++){
                    System.out.print(" "+i);
                }
                System.out.println();
            }
        } else if (ch == 2){
            for(i =n; i>=1; i--){
                for(j = 1; j<=i; j++){
                    System.out.print(" "+i);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
