package JAVA;

import java.util.Scanner;
public class Fibonnanci{
    public static void main(String args[]){
        int fn = 0;
        int sn = 112;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the no. of the rows: ");
            int n = s.nextInt();
            System.out.print("The fibonnanci series is as follows: ");
            System.out.print(fn+" "+sn);
            for(int i =1; i <= n; i++){
                int nn = fn + sn;
                System.out.print(" "+nn);
                fn = sn;
                sn = nn;
            }
        }
    }
}
