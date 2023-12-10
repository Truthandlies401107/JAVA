package JAVA;

import java.util.*;
public class words{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String sn = s.next();
        int length = sn.length();
        for(int i = 1; i<= length; i++)
                System.out.println(sn.substring(0,i));
        s.close();        
    }
}
