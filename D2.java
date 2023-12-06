import java.util.Scanner;
public class D2{
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            int a[][] = new int[2][2];
            //Taking input from user
            for(int i =0; i<2; i++){
                for(int j =0; j<2; j++){
                    System.out.println("Enter Rows and column");
                    a[i][j] = s.nextInt();
                }
            }
            //Now printing it in matrix form
            for(int i =0; i<2; i++){
                for(int j =0; j<2; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}