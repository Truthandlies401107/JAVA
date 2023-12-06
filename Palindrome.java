
public class Palindrome{
    public static void main(String args[]){
        String a = "EEVEE";
        String ra = "";
        int l = a.length();
        for(int i =(l-1); i>=0; --i){
            ra = ra+a.charAt(i);
        }
        if(a.toLowerCase().equals(ra.toLowerCase())){
            System.out.println("The String is a Palindrome.");
        }
        else{
            System.out.println("The String is not a Palindrome.");
        }
    }
}