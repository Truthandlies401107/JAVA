import java.util.*;
public class Palindrome_String{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String to check if it is Palindrome or not. ");
        String str = s.next();
        String k = " ";
        String b = str;
        char c;
        for(int i = str.length()-1; i>=0; --i){
            c = str.charAt(i);
            k = k + c;
        }
        if (k.equals(str)){
            System.out.println("The String is Palindrome");
        } else{
            System.out.println("The String is not Palindrome");
        }
    }
}
