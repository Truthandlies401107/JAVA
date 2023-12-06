import java.util.*;
public class binarysearch{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int searchno;
        int index =-1;
        int start = 0, end, mid;
        int list[] = {11, 33, 40, 45, 68, 72, 89, 95, 99};
        System.out.println("Enter the no. to search: ");
        searchno = s.nextInt();
        end = list.length - 1;
        
        while(start<=end){
            mid = (start+end)/2;
            if (searchno == list[mid]){
                index =mid;
                break;
            } else if (searchno < list[mid])
                end = mid-1;
            else
                start = mid+1;
            }
        if (index >= 0)
                System.out.println("No. "+searchno+" is present. "+index);
        else 
                System.out.println("No. "+searchno+" is not present. ");   
            }
        }
/* WAP 2 perform binary search on the list of int given below 2 search for an element:
   input by the user, if it is not found
   array element = {5,7,9,11,15,20,30,45,89,97} */        