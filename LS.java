import java.util.*;
public class LS{
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            int a[] =new int[10];
            for(int i = 0; i<10; i++){
                System.out.println("Enter the array no. "+(i+1)+":");
                a[i] = s.nextInt();
            }
                System.out.println("The arrays are: ");
             for(int i = 0; i<10; i++){
                System.out.print(" "+a[i]);
            }
            System.out.println("Enter a no. to search: ");
              int b = s.nextInt();
            int f =0;
            int start = 0;
            int end = a.length-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(a[mid]== b){
                    f = 1;
                    System.out.println("The no. is available.");
                }
                if(a[mid]>b){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            if(f == 0)
            {
                System.out.println("The no. is not available");

            }
        }
    }
}