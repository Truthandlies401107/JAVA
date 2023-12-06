import java.util.*;
public class VS{
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            int rollno[] = {101,102,103,104,105};
            int start = 0;
            int end = rollno.length-1;
            System.out.println("Enter the rollno. to search: ");
            int n = s.nextInt();
            int f =0;
            while(start <= end && f == 0){
                int mid = (start+end)/2;
                if(rollno[mid]==n){
                    f = 1;
                    System.out.println("The roll number is available.");
                }
                if(rollno[mid]>n){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            if(f==0){
                System.out.println("The roll number is not available.");
            }
        }
    }
}