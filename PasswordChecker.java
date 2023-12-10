package JAVA;

import java.util.Scanner;
public class PasswordChecker {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name!");
    String name = sc.nextLine();
    System.out.println("Please enter your password");
    String password = sc.nextLine();
    int paslen = password.length();
    String hidpas = "*".repeat(paslen);
    String pastren = "";
if (paslen > 2 && paslen < 6)
  pastren = "weak" ;
if (paslen > 5 && paslen < 12)
        pastren = "strong";
if (paslen > 11)
    pastren = "Unhackable";
if (paslen < 3) 
  System.out.println("The Password must contain 3 or more digits please try again");
  System.out.println(name + ", your password " + hidpas + " is " + paslen + " letters long and it is " + pastren) ;
}
}
