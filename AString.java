// Define a class to declare an array to accept and store ten words.
// Display only those words which begin with the letter 'A' or 'a' and also end with
// the letter 'A' or 'a'.EXAMPLE :Input : Hari, Anita, Akash, Amrita, Alina, Devi Rishab, 
// John, Farha, AMITHA 
// Output: AnitaAmritaAlinaAMITHA

import java.util.*;
public class AString{
    public static void main(String args[]){
        Scanner s = new  Scanner(System.in);
        String arr[] = new String[3];
        System.out.println("Enter the arrays: ");
        for(int i =0; i<3; i++){
            arr[i] = s.nextLine();
        }
        System.out.println();
        System.out.println("The Entered arrays are: ");
        for(int i =0; i<3; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i =0; i<3; i++){
            char ch = arr[i].charAt(i);
            int len = arr[i].length();
            char a = Character.toUpperCase(arr[i].charAt(0));
            char b = Character.toUpperCase(arr[i].charAt(len-1));
            if(a == 'A' && b == 'A'){
                System.out.println(" "+arr[i]);
            }
        }
    }
}