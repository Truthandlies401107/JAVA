import java.util.*;
public class Subject{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int marks[] = new int[5];
        String name[] = new String[5];
        int sum = 0;
        int avg, max, min;
        System.out.println("Enter the names of the Subject's: ");
        for(int i =0; i<name.length; i++){
            System.out.println("Enter subject name "+(i+1)+": ");
            name[i]= s.nextLine();
        }
        System.out.println();
        for(int i =0; i<marks.length; i++){
            System.out.println("Enter the marks of subject "+(i+1)+": ");
            marks[i]= s.nextInt();
        }
        System.out.println();
        System.out.println("Now the marks are: ");
        for(int i =0; i<5; i++){
            System.out.println(name[i]+": "+marks[i]);
        }
        System.out.println();
        for(int i =0; i<5; i++){
            sum = sum+marks[i];
        }
        avg = sum/marks.length;
        System.out.println("The average marks is: "+avg);
        max = marks[0];
        min = marks[0];
        for(int i =0; i<5; i++){
            if(marks[i]>max){
                max = marks[i];
            }
            if(marks[i]<min){
                min = marks[i];
            }
        }
        System.out.println("The maximum is: "+max);
        System.out.println("The minimum is: "+min);
    }
}