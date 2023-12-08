//Define a class to accept a string and convert it into uppercase. Count and display the number of vowels in it.
//Input: roboticsOutput: ROBOTICS
//Number of vowels: 3

import java.util.*;
public class StringUp{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String to convert: ");
        String lc = s.nextLine();
        lc += " ";
        System.out.println("The String after converting: "+lc.toUpperCase());
        int count = 0;
        int len = lc.length();
        for(int i = 0 ; i<len-1; i++){
            char ch = lc.charAt(i);
            if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'||ch == 'a'
            ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                count ++;
                System.out.println("No. of vowels: "+count);
            }
        }
    }
}