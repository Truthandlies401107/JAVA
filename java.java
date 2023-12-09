import java.util.*;
public class java{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String sn = s.next();
      int length;
      length = sn.length();
      for(int i = 0; i<= length; i++){
          System.out.println(sn.charAt(i));
      }
      s.close();
    }
}