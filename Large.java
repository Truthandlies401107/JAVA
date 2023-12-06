import java.util.*;
public class Large{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = s.nextInt();
        System.out.println("Enter number of columns: ");
        int c = s.nextInt();
        int a[][]= new int[r][c];
        for (int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.println("Enter the following no. : "+a[i][j]);
                a[i][j]= s.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.println("Enter the following no. : "+a[i][j]);
            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i<r; i++){
            max = 0;
            for(int j = 0; j<c; j++){
                if(a[i][j] > max)
                max = a[i][j];
                System.out.println("The maximum from row 1 and 2: "+max);
            }
            System.out.println();
        }
        
    }
}