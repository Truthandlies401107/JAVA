package JAVA;

import java.util.*;
public class Bubble{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String l = "";
        String names[] = new String[10];
        System.out.println("Enter The Names: ");
        for(int i = 0; i<10; i++){
            names[i] = s.nextLine();
        }
        for(int i = 0; i< 9; i++){
            for(int j =0; j< 9-i; j++ ){
                if(names[j].compareTo(names[j+1])<0){
                    l = names[j];
                    names[j] = names[j+1];
                    names[j+1] = l;
                }
            }
        }
        System.out.println("The sorted array are: ");
        for(int i =0; i<10; i++){
            System.out.println(names[i]);
        }
    }
}
