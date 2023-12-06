import java.util.*;
public class Import{
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int r;
        int c;
        System.out.println("Enter no. of rows: ");
        r = s.nextInt();
        System.out.println("Enter no. of columns: ");
        c = s.nextInt();
        int rc [][] = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.println("Enter no. : "+rc[i][j]);
                rc[i][j] = s.nextInt();
            }
        }
        System.out.println();
        for (int i =0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(rc[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
// WAP to declare an int array and calculate its length