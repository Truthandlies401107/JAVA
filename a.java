public class a{
    public static void main(String args[]){
        String s = "Radar";
        String rs = "";
        int l = s.length();
        for(int i = (l-1); i >= 0; --i){
            rs = rs + s.charAt(i);
        }
        if(s.toLowerCase().equals(rs.toLowerCase())){
            System.out.println("The String is a palindrome.");
        }
        else {
            System.out.println("The String is not a palindrome.");
        }
    }
}