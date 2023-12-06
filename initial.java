import java.util.*;
public class initial{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[] = {3,2,7,6,4,9,5,8};
        int sc, x =0;
        System.out.println("Enter a number to search: ");
        sc = s.nextInt();
        for(int i =0 ; i<a.length; i++){
            if(a[i] == sc){
                x = 1;
                break;
            }
        }
        if(x == 1){
             System.out.println("The number is available. ");
        }
        else {
            System.out.println("The number is unavailabe. ");
        }
    }
}