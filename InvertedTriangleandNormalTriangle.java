import java.util.*;
public class InvertedTriangleandNormalTriangle{
    public static void main(String args[]){
        int ch, n, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the choice no. 1 or 2: ");
        ch = s.nextInt();
        System.out.println("Enter the no. of rows: ");
        n = s.nextInt();
        if (ch == 1){
            for(i = 1; i <= n; i++){
                for(j = 1; j <= i; j++){
                    System.out.print(" "+i);
                }
                System.out.println();
            }
        } else if (ch == 2){
            for(i = n; i >= 1; i--){
                for(j = 1; j <= i; j++){
                    System.out.print(" "+i);
                }
                System.out.println();
        }
    }
    else {
        System.out.println("Invalid Choice");
    }
}
}