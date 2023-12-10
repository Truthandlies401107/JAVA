import java.util.*;
public class Fibonnanci_Series{
    public static void main(String args[]){
        int fn = 0;
        int sn = 1;
        int nn;
        System.out.println("Enter no. of terms: ");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println("The fibonnanci series is: ");
        for(int i = 0; i<t; i++){
            nn = fn + sn;
            // Therefore,
            fn = sn;
            sn = nn;
            nn = fn;
            System.out.print(" "+nn);
        }
    }
}