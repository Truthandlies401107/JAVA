//write a java program to accept a String in a lower case and change first letter of every word to upper case
// sample input = "we are in cyber world"
// sample output = "We Are In Cyber World"

import java.util.*;
public class Slotoup{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = s.nextLine();
        String output = "";
        for(int i = 0; i<a.length(); i++){
            char current = a.charAt(i);
            if(i==0 || a.charAt(i-1) == ' '){
                output += Character.toUpperCase(current);
            }
            else{
                output += current;
            }
        }
        System.out.println("New string is: "+output);
    }
}