//Define a class to accept a string, and print the characters 
//with the uppercase and lowercase reversed, but all the other characters should remain the same as before.
//EXAMPLE:INPUT : WelCoMe_2024 OUTPUT : wELcOmE_2024

import java.util.*;
public class StringConversion{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.nextLine();
        int len = str.length();
        String a = " ";
        for(int i = 0; i<len; i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    a += Character.toLowerCase(ch);
                }
                else {
                    a += Character.toUpperCase(ch);
                }
            }
            else {
                a+=ch;
            }
        }
        System.out.println(a);
    }
}
