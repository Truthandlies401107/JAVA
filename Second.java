import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];
        int max, min, smax;
        for(int i =0; i<10; i++){
            System.out.println("Enter the no. "+(i+1)+": ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("The entered arrays are: ");
        max = smax = min = a[0];
        for(int i = 0; i<10; i++){
             if (a[i] > max){
                 smax = max;
                 max = a[i];
             }
             if (a[i] > smax && a[i] < max){
                 smax = a[i];
             }
             if (a[i] < min ){
                 min = a[i];
             }
            }
        System.out.println("Largest no. is: "+max);
        System.out.println("Second largest no. is: "+smax);
        System.out.println("Smallest no. is: "+min);
    }
}