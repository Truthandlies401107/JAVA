import java.util.*;
public class R {
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int rollno[]= {101,102,103,104,105};
    int percent[] = {60,90,85,72,89};
    System.out.println("The roll no. is:");
    for(int i =0; i<rollno.length; i++){
        System.out.println(" "+rollno[i]);
    }
    System.out.println("The percent is:");
    for(int i =0; i<percent.length; i++){
        System.out.println(" "+percent[i]);
    }
    System.out.println("Enter a number to search: ");
    int a = s.nextInt();
    int start = 0;
    int end = rollno.length-1;
    int end1 = percent.length-1;
    int f =0;
    while(start<=end && f == 0){
        int mid = (start+end)/2;
        if(rollno[mid]==a){
            f = 1;
            System.out.println("The rollno is on position "+(mid+1));
        }
        if(rollno[mid]>a){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
    if(f == 0){
        System.out.println("Not available");
        }
        int g = 0;
    while(start<=end1 && g == 0){
        int mid = (start+end1)/2;
        if(percent[mid]==a){
            g = 1;
            System.out.println("marks "+mid);
        }
        if(rollno[mid]>a){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
    if(g==0){
        System.out.println("Not available");
    }
    }
}
